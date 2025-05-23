/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\006\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\020\020\t\032\0020\n2\006\020\013\032\0020\fH\026J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\020H\002J\b\020\021\032\0020\003H\026J\b\020\022\032\0020\023H\026R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\007¨\006\024"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "lengthBeforeCursor", "", "lengthAfterCursor", "(II)V", "getLengthAfterCursor", "()I", "getLengthBeforeCursor", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class DeleteSurroundingTextInCodePointsCommand
/*     */   implements EditCommand
/*     */ {
/*     */   private final int lengthBeforeCursor;
/*     */   private final int lengthAfterCursor;
/*     */   public static final int $stable;
/*     */   
/*     */   public DeleteSurroundingTextInCodePointsCommand(int lengthBeforeCursor, int lengthAfterCursor) {
/* 313 */     this.lengthBeforeCursor = lengthBeforeCursor;
/* 314 */     this.lengthAfterCursor = lengthAfterCursor;
/*     */ 
/*     */     
/* 317 */     if (!((this.lengthBeforeCursor >= 0 && this.lengthAfterCursor >= 0) ? 1 : 0)) { int $i$a$-require-DeleteSurroundingTextInCodePointsCommand$1 = 0; String str = 
/* 318 */         "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + 
/* 319 */         this.lengthBeforeCursor + " and " + this.lengthAfterCursor + " respectively.";
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */   
/*     */   } public final int getLengthBeforeCursor() {
/*     */     return this.lengthBeforeCursor;
/*     */   }
/*     */   public void applyTo(@NotNull EditingBuffer buffer) {
/* 326 */     Intrinsics.checkNotNullParameter(buffer, "buffer"); int beforeLenInChars = 0;
/* 327 */     for (int i = 0, k = this.lengthBeforeCursor; i < k; i++) {
/* 328 */       beforeLenInChars++;
/* 329 */       if (buffer.getSelectionStart$ui_text() > beforeLenInChars) {
/* 330 */         char lead = buffer.get$ui_text(buffer.getSelectionStart$ui_text() - beforeLenInChars - 1);
/* 331 */         char trail = buffer.get$ui_text(buffer.getSelectionStart$ui_text() - beforeLenInChars);
/*     */         
/* 333 */         if (EditCommandKt.access$isSurrogatePair(lead, trail)) {
/* 334 */           beforeLenInChars++;
/*     */         }
/*     */       } else {
/*     */         
/* 338 */         beforeLenInChars = buffer.getSelectionStart$ui_text();
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 343 */     int afterLenInChars = 0;
/* 344 */     for (int j = 0, m = this.lengthAfterCursor; j < m; j++) {
/* 345 */       afterLenInChars++;
/* 346 */       if (buffer.getSelectionEnd$ui_text() + afterLenInChars < buffer.getLength$ui_text()) {
/* 347 */         char lead = buffer.get$ui_text(buffer.getSelectionEnd$ui_text() + afterLenInChars - 1);
/* 348 */         char trail = buffer.get$ui_text(buffer.getSelectionEnd$ui_text() + afterLenInChars);
/*     */         
/* 350 */         if (EditCommandKt.access$isSurrogatePair(lead, trail)) {
/* 351 */           afterLenInChars++;
/*     */         }
/*     */       } else {
/*     */         
/* 355 */         afterLenInChars = buffer.getLength$ui_text() - buffer.getSelectionEnd$ui_text();
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 360 */     buffer.delete$ui_text(buffer.getSelectionEnd$ui_text(), buffer.getSelectionEnd$ui_text() + afterLenInChars);
/* 361 */     buffer.delete$ui_text(buffer.getSelectionStart$ui_text() - beforeLenInChars, buffer.getSelectionStart$ui_text());
/*     */   } public final int getLengthAfterCursor() {
/*     */     return this.lengthAfterCursor;
/*     */   } public boolean equals(@Nullable Object other) {
/* 365 */     if (this == other) return true; 
/* 366 */     if (!(other instanceof DeleteSurroundingTextInCodePointsCommand)) return false;
/*     */     
/* 368 */     if (this.lengthBeforeCursor != ((DeleteSurroundingTextInCodePointsCommand)other).lengthBeforeCursor) return false; 
/* 369 */     if (this.lengthAfterCursor != ((DeleteSurroundingTextInCodePointsCommand)other).lengthAfterCursor) return false;
/*     */     
/* 371 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 375 */     int result = this.lengthBeforeCursor;
/* 376 */     result = 31 * result + this.lengthAfterCursor;
/* 377 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 381 */     return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + 
/* 382 */       this.lengthAfterCursor + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\DeleteSurroundingTextInCodePointsCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */