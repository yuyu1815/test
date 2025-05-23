/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.ui.text.style.TextOverflow;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\002\n\002\020\b\n\000\b\001\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\001H\002J\b\020\n\032\0020\013H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\f"}, d2 = {"Landroidx/compose/ui/text/CacheTextLayoutInput;", "", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "(Landroidx/compose/ui/text/TextLayoutInput;)V", "getTextLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "equals", "", "other", "hashCode", "", "ui-text"})
/*     */ @Immutable
/*     */ public final class CacheTextLayoutInput
/*     */ {
/*     */   @NotNull
/*     */   private final TextLayoutInput textLayoutInput;
/*     */   public static final int $stable;
/*     */   
/*     */   public CacheTextLayoutInput(@NotNull TextLayoutInput textLayoutInput) {
/* 382 */     this.textLayoutInput = textLayoutInput; } @NotNull public final TextLayoutInput getTextLayoutInput() { return this.textLayoutInput; }
/*     */    public int hashCode() {
/* 384 */     TextLayoutInput $this$hashCode_u24lambda_u240 = this.textLayoutInput; int $i$a$-with-CacheTextLayoutInput$hashCode$1 = 0;
/* 385 */     int result = $this$hashCode_u24lambda_u240.getText().hashCode();
/* 386 */     result = 31 * result + $this$hashCode_u24lambda_u240.getStyle().hashCodeLayoutAffectingAttributes$ui_text();
/* 387 */     result = 31 * result + $this$hashCode_u24lambda_u240.getPlaceholders().hashCode();
/* 388 */     result = 31 * result + $this$hashCode_u24lambda_u240.getMaxLines();
/* 389 */     result = 31 * result + Boolean.hashCode($this$hashCode_u24lambda_u240.getSoftWrap());
/* 390 */     result = 31 * result + TextOverflow.hashCode-impl($this$hashCode_u24lambda_u240.getOverflow-gIe3tQ8());
/* 391 */     result = 31 * result + $this$hashCode_u24lambda_u240.getDensity().hashCode();
/* 392 */     result = 31 * result + $this$hashCode_u24lambda_u240.getLayoutDirection().hashCode();
/* 393 */     result = 31 * result + $this$hashCode_u24lambda_u240.getFontFamilyResolver().hashCode();
/* 394 */     result = 31 * result + Integer.hashCode(Constraints.getMaxWidth-impl($this$hashCode_u24lambda_u240.getConstraints-msEJaDk()));
/* 395 */     result = 31 * result + Integer.hashCode(Constraints.getMaxHeight-impl($this$hashCode_u24lambda_u240.getConstraints-msEJaDk()));
/* 396 */     return result;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 400 */     if (this == other) return true; 
/* 401 */     if (!(other instanceof CacheTextLayoutInput)) return false;
/*     */     
/* 403 */     TextLayoutInput $this$equals_u24lambda_u241 = this.textLayoutInput; int $i$a$-with-CacheTextLayoutInput$equals$1 = 0;
/* 404 */     if (!Intrinsics.areEqual($this$equals_u24lambda_u241.getText(), ((CacheTextLayoutInput)other).textLayoutInput.getText())) return false; 
/* 405 */     if (!$this$equals_u24lambda_u241.getStyle().hasSameLayoutAffectingAttributes(((CacheTextLayoutInput)other).textLayoutInput.getStyle())) return false; 
/* 406 */     if (!Intrinsics.areEqual($this$equals_u24lambda_u241.getPlaceholders(), ((CacheTextLayoutInput)other).textLayoutInput.getPlaceholders())) return false; 
/* 407 */     if ($this$equals_u24lambda_u241.getMaxLines() != ((CacheTextLayoutInput)other).textLayoutInput.getMaxLines()) return false; 
/* 408 */     if ($this$equals_u24lambda_u241.getSoftWrap() != ((CacheTextLayoutInput)other).textLayoutInput.getSoftWrap()) return false; 
/* 409 */     if (!TextOverflow.equals-impl0($this$equals_u24lambda_u241.getOverflow-gIe3tQ8(), ((CacheTextLayoutInput)other).textLayoutInput.getOverflow-gIe3tQ8())) return false; 
/* 410 */     if (!Intrinsics.areEqual($this$equals_u24lambda_u241.getDensity(), ((CacheTextLayoutInput)other).textLayoutInput.getDensity())) return false; 
/* 411 */     if ($this$equals_u24lambda_u241.getLayoutDirection() != ((CacheTextLayoutInput)other).textLayoutInput.getLayoutDirection()) return false; 
/* 412 */     if ($this$equals_u24lambda_u241.getFontFamilyResolver() != ((CacheTextLayoutInput)other).textLayoutInput.getFontFamilyResolver()) return false; 
/* 413 */     if (Constraints.getMaxWidth-impl($this$equals_u24lambda_u241.getConstraints-msEJaDk()) != Constraints.getMaxWidth-impl(((CacheTextLayoutInput)other).textLayoutInput.getConstraints-msEJaDk())) return false; 
/* 414 */     if (Constraints.getMaxHeight-impl($this$equals_u24lambda_u241.getConstraints-msEJaDk()) != Constraints.getMaxHeight-impl(((CacheTextLayoutInput)other).textLayoutInput.getConstraints-msEJaDk())) return false;
/*     */ 
/*     */     
/* 417 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\CacheTextLayoutInput.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */