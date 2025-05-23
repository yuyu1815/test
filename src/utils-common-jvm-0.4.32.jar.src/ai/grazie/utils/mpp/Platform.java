/*   */ package ai.grazie.utils.mpp;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\000 \0052\b\022\004\022\0020\0000\001:\001\005B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/Platform;", "", "(Ljava/lang/String;I)V", "JS", "JVM", "Companion", "utils-common"})
/*   */ public enum Platform { @NotNull
/*   */   public static final Companion Companion;
/* 4 */   JS, JVM; @NotNull private static final Platform current; static { Companion = new Companion(null);
/*   */ 
/*   */     
/* 7 */     current = JVM; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/utils/mpp/Platform$Companion;", "", "()V", "current", "Lai/grazie/utils/mpp/Platform;", "getCurrent", "()Lai/grazie/utils/mpp/Platform;", "utils-common"}) public static final class Companion { @NotNull public final Platform getCurrent() { return Platform.current; }
/*   */ 
/*   */     
/*   */     private Companion() {} }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\Platform.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */