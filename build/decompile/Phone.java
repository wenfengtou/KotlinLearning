/*
 * Decompiled with CFR 0.150.
 */
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0018\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0002\u001a\u0002H\u001a\u00a2\u0006\u0002\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011\u00a8\u0006\u001c"}, d2={"LPhone;", "", "v1", "", "v2", "v3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "input", "(Ljava/lang/String;)V", "Num", "getNum", "()Ljava/lang/String;", "value", "", "cost", "getCost", "()I", "setCost", "(I)V", "number2", "getNumber2", "weight", "getWeight", "isInt", "", "T", "(Ljava/lang/Object;)Z", "KotlinLearning"})
public final class Phone {
    @NotNull
    private final String Num;
    private int cost;

    public Phone(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        System.out.println((Object)"Init block");
        this.Num = input;
    }

    @NotNull
    public final String getNum() {
        return this.Num;
    }

    public Phone(@NotNull String v1, @NotNull String v2, @NotNull String v3) {
        Intrinsics.checkNotNullParameter(v1, "v1");
        Intrinsics.checkNotNullParameter(v2, "v2");
        Intrinsics.checkNotNullParameter(v3, "v3");
        this(v1, v2);
        System.out.println((Object)"cons ci22");
    }

    public Phone(@NotNull String v2, @NotNull String v1) {
        Intrinsics.checkNotNullParameter(v2, "v2");
        Intrinsics.checkNotNullParameter(v1, "v1");
        this(v1);
        System.out.println((Object)"cons ci");
    }

    public final <T> boolean isInt(T v1) {
        System.out.println((Object)"haha");
        return true;
    }

    public final int getCost() {
        return 10;
    }

    public final void setCost(int value) {
        System.out.println((Object)"you set cost");
        this.cost = value;
    }

    public final int getWeight() {
        return this.getCost() + 1;
    }

    public final int getNumber2() {
        return ((Number)CollectionsKt.first(CollectionsKt.shuffled(new IntRange(1, 1000)))).intValue();
    }
}
