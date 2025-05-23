/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.compose.ui.text.AnnotatedString;
/*     */ import androidx.compose.ui.text.TextRange;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\032\n\020\000\032\0020\001*\0020\002\032\022\020\003\032\0020\001*\0020\0022\006\020\004\032\0020\005\032\022\020\006\032\0020\001*\0020\0022\006\020\004\032\0020\005¨\006\007"}, d2 = {"getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "ui-text"})
/*     */ public final class TextFieldValueKt
/*     */ {
/*     */   @NotNull
/*     */   public static final AnnotatedString getTextBeforeSelection(@NotNull TextFieldValue $this$getTextBeforeSelection, int maxChars) {
/* 185 */     Intrinsics.checkNotNullParameter($this$getTextBeforeSelection, "<this>"); return $this$getTextBeforeSelection.getAnnotatedString().subSequence(Math.max(0, TextRange.getMin-impl($this$getTextBeforeSelection.getSelection-d9O1mEE()) - maxChars), TextRange.getMin-impl($this$getTextBeforeSelection.getSelection-d9O1mEE()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final AnnotatedString getTextAfterSelection(@NotNull TextFieldValue $this$getTextAfterSelection, int maxChars) {
/* 196 */     Intrinsics.checkNotNullParameter($this$getTextAfterSelection, "<this>"); return $this$getTextAfterSelection.getAnnotatedString().subSequence(TextRange.getMax-impl($this$getTextAfterSelection.getSelection-d9O1mEE()), Math.min(TextRange.getMax-impl($this$getTextAfterSelection.getSelection-d9O1mEE()) + maxChars, $this$getTextAfterSelection.getText().length()));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final AnnotatedString getSelectedText(@NotNull TextFieldValue $this$getSelectedText) {
/* 201 */     Intrinsics.checkNotNullParameter($this$getSelectedText, "<this>"); return $this$getSelectedText.getAnnotatedString().subSequence-5zc-tL8($this$getSelectedText.getSelection-d9O1mEE());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\TextFieldValueKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */