/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.AnnotatedString;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.ranges.RangesKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\b\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\000\n\002\b\003\b\007\030\0002\0020\001B\027\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006B\025\022\006\020\007\032\0020\b\022\006\020\004\032\0020\005¢\006\002\020\tJ\020\020\020\032\0020\0212\006\020\022\032\0020\023H\026J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027H\002J\b\020\030\032\0020\005H\026J\b\020\031\032\0020\003H\026R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\002\032\0020\0038F¢\006\006\032\004\b\016\020\017¨\006\032"}, d2 = {"Landroidx/compose/ui/text/input/CommitTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "text", "", "newCursorPosition", "", "(Ljava/lang/String;I)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;I)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getNewCursorPosition", "()I", "getText", "()Ljava/lang/String;", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class CommitTextCommand
/*     */   implements EditCommand
/*     */ {
/*     */   @NotNull
/*     */   private final AnnotatedString annotatedString;
/*     */   private final int newCursorPosition;
/*     */   public static final int $stable;
/*     */   
/*     */   public CommitTextCommand(@NotNull AnnotatedString annotatedString, int newCursorPosition) {
/*  45 */     this.annotatedString = annotatedString;
/*  46 */     this.newCursorPosition = newCursorPosition; } public final int getNewCursorPosition() { return this.newCursorPosition; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final AnnotatedString getAnnotatedString() {
/*     */     return this.annotatedString;
/*     */   }
/*     */ 
/*     */   
/*     */   public CommitTextCommand(@NotNull String text, int newCursorPosition) {
/*  58 */     this(new AnnotatedString(text, null, null, 6, null), newCursorPosition); } @NotNull
/*     */   public final String getText() {
/*  60 */     return this.annotatedString.getText();
/*     */   }
/*     */ 
/*     */   
/*     */   public void applyTo(@NotNull EditingBuffer buffer) {
/*  65 */     Intrinsics.checkNotNullParameter(buffer, "buffer"); if (buffer.hasComposition$ui_text()) {
/*  66 */       buffer.replace$ui_text(buffer.getCompositionStart$ui_text(), buffer.getCompositionEnd$ui_text(), getText());
/*     */     } else {
/*     */       
/*  69 */       buffer.replace$ui_text(buffer.getSelectionStart$ui_text(), buffer.getSelectionEnd$ui_text(), getText());
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  74 */     int newCursor = buffer.getCursor$ui_text();
/*     */ 
/*     */     
/*  77 */     int newCursorInBuffer = (this.newCursorPosition > 0) ? (
/*  78 */       newCursor + this.newCursorPosition - 1) : (
/*     */       
/*  80 */       newCursor + this.newCursorPosition - getText().length());
/*     */ 
/*     */     
/*  83 */     buffer.setCursor$ui_text(RangesKt.coerceIn(newCursorInBuffer, 0, buffer.getLength$ui_text()));
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*  87 */     if (this == other) return true; 
/*  88 */     if (!(other instanceof CommitTextCommand)) return false;
/*     */     
/*  90 */     if (!Intrinsics.areEqual(getText(), ((CommitTextCommand)other).getText())) return false; 
/*  91 */     if (this.newCursorPosition != ((CommitTextCommand)other).newCursorPosition) return false;
/*     */     
/*  93 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  97 */     int result = getText().hashCode();
/*  98 */     result = 31 * result + this.newCursorPosition;
/*  99 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 103 */     return "CommitTextCommand(text='" + getText() + "', newCursorPosition=" + this.newCursorPosition + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\CommitTextCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */