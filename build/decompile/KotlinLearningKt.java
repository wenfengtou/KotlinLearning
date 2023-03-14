/*
 * Decompiled with CFR 0.150.
 */
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=2, xi=48, d1={"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2={"fetchData", "Lkotlinx/coroutines/flow/Flow;", "", "main", "", "KotlinLearning"})
public final class KotlinLearningKt {
    @NotNull
    public static final Flow<String> fetchData() {
        return FlowKt.flow((Function2)new Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object>(null){
            int I$0;
            int label;
            private /* synthetic */ Object L$0;

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Lifted jumps to return sites
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object var1_1) {
                var4_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(var1_1);
                        $this$flow = (FlowCollector)this.L$0;
                        i = 1;
                        ** GOTO lbl27
                    }
                    case 1: {
                        i = this.I$0;
                        $this$flow = (FlowCollector)this.L$0;
                        ResultKt.throwOnFailure($result);
                        v0 = $result;
                        while (true) {
                            this.L$0 = $this$flow;
                            this.I$0 = i;
                            this.label = 2;
                            v1 = $this$flow.emit("Data #" + i, this);
                            if (v1 == var4_2) {
                                return var4_2;
                            }
                            ** GOTO lbl26
                            break;
                        }
                    }
                    case 2: {
                        i = this.I$0;
                        $this$flow = (FlowCollector)this.L$0;
                        ResultKt.throwOnFailure($result);
                        v1 = $result;
lbl26:
                        // 2 sources

                        ++i;
lbl27:
                        // 2 sources

                        if (i >= 4) return Unit.INSTANCE;
                        this.L$0 = $this$flow;
                        this.I$0 = i;
                        this.label = 1;
                        if ((v0 = DelayKt.delay(1000L, this)) != var4_2) ** continue;
                        return var4_2;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @NotNull
            public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<?> $completion) {
                Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> function2 = new /* invalid duplicate definition of identical inner class */;
                function2.L$0 = value;
                return (Continuation)((Object)function2);
            }

            @Nullable
            public final Object invoke(@NotNull FlowCollector<? super String> p1, @Nullable Continuation<? super Unit> p2) {
                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        });
    }

    public static final void main() {
        BuildersKt.runBlocking$default(null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null){
            int label;

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Lifted jumps to return sites
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object var1_1) {
                var13_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(var1_1);
                        inputFun = main.inputFun.1.INSTANCE;
                        var4_4 = new String[]{"1", "2"};
                        list0 = CollectionsKt.listOf(var4_4);
                        var4_5 = "input " + list0;
                        System.out.println((Object)var4_5);
                        var5_8 = new String[]{"33", "eee", "ddd"};
                        var4_6 = CollectionsKt.mutableListOf(var5_8);
                        v1 = var4_6.get(0);
                        var4_6.get(1);
                        var4_6.toString();
                        var6_9 = "input " + v1;
                        System.out.println((Object)var6_9);
                        nullString = null;
                        $this$invokeSuspend_u24lambda_u2d1 = var7_10 = new User(null, 0, 3, null);
                        $i$a$-apply-KotlinLearningKt$main$1$yan$1 = false;
                        $this$invokeSuspend_u24lambda_u2d1.setName("yan");
                        $this$invokeSuspend_u24lambda_u2d1.setAge(10);
                        it = $i$a$-apply-KotlinLearningKt$main$1$yan$1 = (str = "Hello, world!");
                        $i$a$-also-KotlinLearningKt$main$1$hki$1 = 0;
                        System.out.println((Object)it);
                        it = 0;
                        $i$a$-also-KotlinLearningKt$main$1$hki$1 = 5;
                        v0 = $i$a$-apply-KotlinLearningKt$main$1$yan$1.substring(it, $i$a$-also-KotlinLearningKt$main$1$hki$1);
                        Intrinsics.checkNotNullExpressionValue(v0, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                        it = $i$a$-apply-KotlinLearningKt$main$1$yan$1 = v0;
                        $i$a$-also-KotlinLearningKt$main$1$hki$2 = false;
                        System.out.println((Object)it);
                        hki = $i$a$-apply-KotlinLearningKt$main$1$yan$1;
                        $i$a$-apply-KotlinLearningKt$main$1$yan$1 = "hki = " + hki;
                        System.out.println((Object)$i$a$-apply-KotlinLearningKt$main$1$yan$1);
                        firstStr = null;
                        it = "firstStr = " + firstStr;
                        System.out.println((Object)it);
                        inputFun.invoke("haha");
                        $this$collect$iv = flow = KotlinLearningKt.fetchData();
                        $i$f$collect = false;
                        this.label = 1;
                        v1 = $this$collect$iv.collect(new FlowCollector<String>(){

                            @Nullable
                            public Object emit(Object value, @NotNull Continuation continuation) {
                                Continuation continuation2 = continuation;
                                String data = (String)value;
                                boolean bl = false;
                                System.out.println((Object)data);
                                return Unit.INSTANCE;
                            }
                        }, this);
                        if (v1 == var13_2) {
                            return var13_2;
                        }
                        ** GOTO lbl60
                    }
                    case 1: {
                        $i$f$collect = false;
                        ResultKt.throwOnFailure($result);
                        v1 = $result;
lbl60:
                        // 2 sources

                        System.out.println((Object)"Completed");
                        return Unit.INSTANCE;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @NotNull
            public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<?> $completion) {
                return (Continuation)((Object)new /* invalid duplicate definition of identical inner class */);
            }

            @Nullable
            public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<? super Unit> p2) {
                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        }, 1, null);
    }

    public static /* synthetic */ void main(String[] args) {
        KotlinLearningKt.main();
    }
}
