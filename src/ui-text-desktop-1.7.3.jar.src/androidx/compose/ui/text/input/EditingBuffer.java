/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.AnnotatedString;
/*     */ import androidx.compose.ui.text.TextRange;
/*     */ import androidx.compose.ui.text.TextRangeKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\n\n\002\030\002\n\002\b\f\n\002\020\002\n\002\b\b\n\002\020\f\n\002\b\003\n\002\020\013\n\002\b\f\b\007\030\000 =2\0020\001:\001=B\027\b\020\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006B\025\022\006\020\002\032\0020\007\022\006\020\004\032\0020\005¢\006\002\020\bJ\r\020$\032\0020%H\000¢\006\002\b&J\r\020'\032\0020%H\000¢\006\002\b(J\035\020)\032\0020%2\006\020*\032\0020\r2\006\020+\032\0020\rH\000¢\006\002\b,J\026\020-\032\0020.2\006\020/\032\0020\rH\002¢\006\002\b0J\r\0201\032\00202H\000¢\006\002\b3J%\0204\032\0020%2\006\020*\032\0020\r2\006\020+\032\0020\r2\006\020\002\032\0020\007H\000¢\006\002\b5J%\0204\032\0020%2\006\020*\032\0020\r2\006\020+\032\0020\r2\006\020\002\032\0020\003H\000¢\006\002\b5J\035\0206\032\0020%2\006\020*\032\0020\r2\006\020+\032\0020\rH\000¢\006\002\b7J\035\0208\032\0020%2\006\020*\032\0020\r2\006\020+\032\0020\rH\000¢\006\002\b9J\r\020:\032\0020\007H\000¢\006\002\b;J\b\020<\032\0020\003H\026R\034\020\t\032\004\030\0010\0058@X\004ø\001\000ø\001\001¢\006\006\032\004\b\n\020\013R\036\020\016\032\0020\r2\006\020\f\032\0020\r@BX\016¢\006\b\n\000\032\004\b\017\020\020R\036\020\021\032\0020\r2\006\020\f\032\0020\r@BX\016¢\006\b\n\000\032\004\b\022\020\020R$\020\023\032\0020\r2\006\020\023\032\0020\r8@@@X\016¢\006\f\032\004\b\024\020\020\"\004\b\025\020\026R\016\020\027\032\0020\030X\004¢\006\002\n\000R\024\020\031\032\0020\r8@X\004¢\006\006\032\004\b\032\020\020R\032\020\004\032\0020\0058@X\004ø\001\000ø\001\001¢\006\006\032\004\b\033\020\034R$\020\036\032\0020\r2\006\020\035\032\0020\r@BX\016¢\006\016\n\000\032\004\b\037\020\020\"\004\b \020\026R$\020!\032\0020\r2\006\020\035\032\0020\r@BX\016¢\006\016\n\000\032\004\b\"\020\020\"\004\b#\020\026\002\013\n\005\b¡\0360\001\n\002\b!¨\006>"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "composition", "getComposition-MzsxiRA$ui_text", "()Landroidx/compose/ui/text/TextRange;", "<set-?>", "", "compositionEnd", "getCompositionEnd$ui_text", "()I", "compositionStart", "getCompositionStart$ui_text", "cursor", "getCursor$ui_text", "setCursor$ui_text", "(I)V", "gapBuffer", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "length", "getLength$ui_text", "getSelection-d9O1mEE$ui_text", "()J", "value", "selectionEnd", "getSelectionEnd$ui_text", "setSelectionEnd", "selectionStart", "getSelectionStart$ui_text", "setSelectionStart", "cancelComposition", "", "cancelComposition$ui_text", "commitComposition", "commitComposition$ui_text", "delete", "start", "end", "delete$ui_text", "get", "", "index", "get$ui_text", "hasComposition", "", "hasComposition$ui_text", "replace", "replace$ui_text", "setComposition", "setComposition$ui_text", "setSelection", "setSelection$ui_text", "toAnnotatedString", "toAnnotatedString$ui_text", "toString", "Companion", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
/*     */ public final class EditingBuffer
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final PartialGapBuffer gapBuffer;
/*     */   private int selectionStart;
/*     */   private int selectionEnd;
/*     */   private int compositionStart;
/*     */   private int compositionEnd;
/*     */   public static final int $stable = 8;
/*     */   public static final int NOWHERE = -1;
/*     */   
/*     */   private EditingBuffer(AnnotatedString text, long selection) {
/*  47 */     this.gapBuffer = new PartialGapBuffer(text.getText());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  52 */     this.selectionStart = TextRange.getMin-impl(selection);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  61 */     this.selectionEnd = TextRange.getMax-impl(selection);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     this.compositionStart = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  80 */     this.compositionEnd = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 138 */     int start = TextRange.getMin-impl(selection);
/* 139 */     int end = TextRange.getMax-impl(selection);
/* 140 */     if (start < 0 || start > text.length()) {
/* 141 */       throw new IndexOutOfBoundsException(
/* 142 */           "start (" + start + ") offset is outside of text region " + text.length());
/*     */     }
/*     */ 
/*     */     
/* 146 */     if (end < 0 || end > text.length()) {
/* 147 */       throw new IndexOutOfBoundsException(
/* 148 */           "end (" + end + ") offset is outside of text region " + text.length());
/*     */     }
/*     */ 
/*     */     
/* 152 */     if (start > end) {
/* 153 */       throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\005"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer$Companion;", "", "()V", "NOWHERE", "", "ui-text"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getSelectionStart$ui_text() {
/*     */     return this.selectionStart;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void setSelectionStart(int value)
/*     */   {
/*     */     if (!((value >= 0) ? 1 : 0))
/* 403 */     { int $i$a$-require-EditingBuffer$selectionStart$1 = 0; String str = "Cannot set selectionStart to a negative value: " + value; throw new IllegalArgumentException(str.toString()); }  this.selectionStart = value; } private final void setSelectionEnd(int value) { if (!((value >= 0) ? 1 : 0)) { int $i$a$-require-EditingBuffer$selectionEnd$1 = 0;
/*     */       String str = "Cannot set selectionEnd to a negative value: " + value;
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/*     */     this.selectionEnd = value; }
/*     */ 
/*     */   
/*     */   public final int getSelectionEnd$ui_text() {
/*     */     return this.selectionEnd;
/*     */   }
/*     */   
/*     */   public final int getCompositionStart$ui_text() {
/*     */     return this.compositionStart;
/*     */   }
/*     */   
/*     */   public final int getCompositionEnd$ui_text() {
/*     */     return this.compositionEnd;
/*     */   }
/*     */   
/*     */   public final boolean hasComposition$ui_text() {
/*     */     return (this.compositionStart != -1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final TextRange getComposition-MzsxiRA$ui_text() {
/*     */     return hasComposition$ui_text() ? TextRange.box-impl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd)) : null;
/*     */   }
/*     */   
/*     */   public final long getSelection-d9O1mEE$ui_text() {
/*     */     return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
/*     */   }
/*     */   
/*     */   public final int getCursor$ui_text() {
/*     */     return (this.selectionStart == this.selectionEnd) ? this.selectionEnd : -1;
/*     */   }
/*     */   
/*     */   public final void setCursor$ui_text(int cursor) {
/*     */     setSelection$ui_text(cursor, cursor);
/*     */   }
/*     */   
/*     */   public final char get$ui_text(int index) {
/*     */     return this.gapBuffer.get(index);
/*     */   }
/*     */   
/*     */   public final int getLength$ui_text() {
/*     */     return this.gapBuffer.getLength();
/*     */   }
/*     */   
/*     */   private EditingBuffer(String text, long selection) {
/*     */     this(new AnnotatedString(text, null, null, 6, null), selection, (DefaultConstructorMarker)null);
/*     */   }
/*     */   
/*     */   public final void replace$ui_text(int start, int end, @NotNull AnnotatedString text) {
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     replace$ui_text(start, end, text.getText());
/*     */   }
/*     */   
/*     */   public final void replace$ui_text(int start, int end, @NotNull String text) {
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     if (start < 0 || start > this.gapBuffer.getLength())
/*     */       throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.getLength()); 
/*     */     if (end < 0 || end > this.gapBuffer.getLength())
/*     */       throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.getLength()); 
/*     */     if (start > end)
/*     */       throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end); 
/*     */     this.gapBuffer.replace(start, end, text);
/*     */     setSelectionStart(start + text.length());
/*     */     setSelectionEnd(start + text.length());
/*     */     this.compositionStart = -1;
/*     */     this.compositionEnd = -1;
/*     */   }
/*     */   
/*     */   public final void delete$ui_text(int start, int end) {
/*     */     long deleteRange = TextRangeKt.TextRange(start, end);
/*     */     this.gapBuffer.replace(start, end, "");
/*     */     long newSelection = EditingBufferKt.updateRangeAfterDelete-pWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), deleteRange);
/*     */     setSelectionStart(TextRange.getMin-impl(newSelection));
/*     */     setSelectionEnd(TextRange.getMax-impl(newSelection));
/*     */     if (hasComposition$ui_text()) {
/*     */       long compositionRange = TextRangeKt.TextRange(this.compositionStart, this.compositionEnd);
/*     */       long newComposition = EditingBufferKt.updateRangeAfterDelete-pWDy79M(compositionRange, deleteRange);
/*     */       if (TextRange.getCollapsed-impl(newComposition)) {
/*     */         commitComposition$ui_text();
/*     */       } else {
/*     */         this.compositionStart = TextRange.getMin-impl(newComposition);
/*     */         this.compositionEnd = TextRange.getMax-impl(newComposition);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void setSelection$ui_text(int start, int end) {
/*     */     if (start < 0 || start > this.gapBuffer.getLength())
/*     */       throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.getLength()); 
/*     */     if (end < 0 || end > this.gapBuffer.getLength())
/*     */       throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.getLength()); 
/*     */     if (start > end)
/*     */       throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end); 
/*     */     setSelectionStart(start);
/*     */     setSelectionEnd(end);
/*     */   }
/*     */   
/*     */   public final void setComposition$ui_text(int start, int end) {
/*     */     if (start < 0 || start > this.gapBuffer.getLength())
/*     */       throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.getLength()); 
/*     */     if (end < 0 || end > this.gapBuffer.getLength())
/*     */       throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.getLength()); 
/*     */     if (start >= end)
/*     */       throw new IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end); 
/*     */     this.compositionStart = start;
/*     */     this.compositionEnd = end;
/*     */   }
/*     */   
/*     */   public final void cancelComposition$ui_text() {
/*     */     replace$ui_text(this.compositionStart, this.compositionEnd, "");
/*     */     this.compositionStart = -1;
/*     */     this.compositionEnd = -1;
/*     */   }
/*     */   
/*     */   public final void commitComposition$ui_text() {
/*     */     this.compositionStart = -1;
/*     */     this.compositionEnd = -1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return this.gapBuffer.toString();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AnnotatedString toAnnotatedString$ui_text() {
/*     */     return new AnnotatedString(toString(), null, null, 6, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\EditingBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */