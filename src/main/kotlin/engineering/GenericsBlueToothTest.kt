package engineering

interface BluetoothDataProducer<out T> {
    fun getData(): T
}

interface BluetoothDataConsumer<in T> {
    fun showData(data: T)
}

class BluetoothDataProcessor<T>(private val producer: BluetoothDataProducer<T>, private val consumer: BluetoothDataConsumer<T>) {
    fun process() {
        val data = producer.getData()
        consumer.showData(data)
    }
}

class BluetoothData(val data: String)

class BluetoothDataReceiver : BluetoothDataProducer<BluetoothData> {
    override fun getData(): BluetoothData {
        // 从蓝牙获取数据并解析为 BluetoothData 对象
        return BluetoothData("Bluetooth data received.")
    }
}

class BluetoothDataViewer : BluetoothDataConsumer<BluetoothData> {
    override fun showData(data: BluetoothData) {
        // 显示 BluetoothData 对象中的数据
        println(data.data)
    }
}

fun main() {
    val receiver = BluetoothDataReceiver()
    val viewer = BluetoothDataViewer()
    val processor = BluetoothDataProcessor(receiver, viewer)
    processor.process() // 处理蓝牙数据并显示
}
