/*     */ package org.jetbrains.jewel.ui.painter;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\030\002\n\002\b\002\b'\030\0002\0020\001B\007¢\006\004\b\002\020\003J\f\020\004\032\0020\005*\0020\006H\026J\f\020\007\032\0020\005*\0020\006H&¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/PainterSuffixHint;", "Lorg/jetbrains/jewel/ui/painter/PainterPathHint;", "<init>", "()V", "patch", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "suffix", "ui"})
/*     */ @Immutable
/*     */ public abstract class PainterSuffixHint
/*     */   implements PainterPathHint
/*     */ {
/*     */   public static final int $stable;
/*     */   
/*     */   public boolean canApply(@NotNull PainterProviderScope $this$canApply) {
/* 104 */     return PainterPathHint.DefaultImpls.canApply(this, $this$canApply); } @NotNull
/*     */   public String patch(@NotNull PainterProviderScope $this$patch) {
/* 106 */     Intrinsics.checkNotNullParameter($this$patch, "<this>"); StringBuilder stringBuilder1 = new StringBuilder(), $this$patch_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-PainterSuffixHint$patch$1 = 0;
/* 107 */     $this$patch_u24lambda_u240.append(StringsKt.substringBeforeLast($this$patch.getPath(), '/', ""));
/* 108 */     $this$patch_u24lambda_u240.append('/');
/* 109 */     $this$patch_u24lambda_u240.append(StringsKt.substringAfterLast$default(StringsKt.substringBeforeLast$default($this$patch.getPath(), '.', null, 2, null), '/', null, 2, null));
/* 110 */     $this$patch_u24lambda_u240.append(suffix($this$patch));
/*     */     
/* 112 */     $this$patch_u24lambda_u240.append('.');
/* 113 */     $this$patch_u24lambda_u240.append(StringsKt.substringAfterLast$default($this$patch.getPath(), '.', null, 2, null));
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public abstract String suffix(@NotNull PainterProviderScope paramPainterProviderScope);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\PainterSuffixHint.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */