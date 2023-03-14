/*
 * Decompiled with CFR 0.150.
 */
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2={"LsmartPhone;", "", "()V", "haha", "", "getHaha", "()Ljava/lang/String;", "setHaha", "(Ljava/lang/String;)V", "sayHello", "", "KotlinLearning"})
public final class smartPhone {
    @NotNull
    public static final smartPhone INSTANCE = new smartPhone();
    @NotNull
    private static String haha = "";

    private smartPhone() {
    }

    @NotNull
    public final String getHaha() {
        return haha;
    }

    public final void setHaha(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        haha = string;
    }

    public final void sayHello() {
        System.out.println((Object)"");
    }
}
