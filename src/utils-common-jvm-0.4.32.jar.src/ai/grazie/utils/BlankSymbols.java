/*     */ package ai.grazie.utils;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\005\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\007\032\0020\0042\006\020\b\032\0020\004R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000¨\006\t"}, d2 = {"Lai/grazie/utils/BlankSymbols;", "", "()V", "VISIBLE_RETURN", "", "VISIBLE_SPACE", "VISIBLE_TAB", "visualize", "text", "utils-common"})
/*     */ public final class BlankSymbols
/*     */ {
/*     */   @NotNull
/*     */   public static final BlankSymbols INSTANCE = new BlankSymbols();
/*     */   @NotNull
/*     */   public static final String VISIBLE_SPACE = "␣";
/*     */   @NotNull
/*     */   public static final String VISIBLE_RETURN = "⏎";
/*     */   @NotNull
/*     */   public static final String VISIBLE_TAB = "⇥";
/*     */   
/*     */   @NotNull
/*     */   public final String visualize(@NotNull String text) {
/* 117 */     Intrinsics.checkNotNullParameter(text, "text"); return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 123 */       StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(text, " ", "␣", false, 4, null), "\t", "⇥", false, 4, null), "\r\n", "⏎", false, 4, null), "\n\r", "⏎", false, 4, null), "\n", "⏎", false, 4, null), "\r", "⏎", false, 4, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\BlankSymbols.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */