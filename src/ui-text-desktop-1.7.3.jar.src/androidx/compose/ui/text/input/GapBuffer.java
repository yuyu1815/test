/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\031\n\000\n\002\020\b\n\002\b\007\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\f\n\002\b\006\n\002\020\016\n\002\b\002\b\002\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\007J\022\020\f\032\0020\r2\n\020\016\032\0060\017j\002`\020J\030\020\021\032\0020\r2\006\020\022\032\0020\0052\006\020\023\032\0020\005H\002J\b\020\024\032\0020\005H\002J\021\020\025\032\0020\0262\006\020\027\032\0020\005H\002J\006\020\030\032\0020\005J\020\020\031\032\0020\r2\006\020\032\032\0020\005H\002J\036\020\033\032\0020\r2\006\020\022\032\0020\0052\006\020\023\032\0020\0052\006\020\034\032\0020\035J\b\020\036\032\0020\035H\026R\016\020\b\032\0020\003X\016¢\006\002\n\000R\016\020\t\032\0020\005X\016¢\006\002\n\000R\016\020\n\032\0020\005X\016¢\006\002\n\000R\016\020\013\032\0020\005X\016¢\006\002\n\000¨\006\037"}, d2 = {"Landroidx/compose/ui/text/input/GapBuffer;", "", "initBuffer", "", "initGapStart", "", "initGapEnd", "([CII)V", "buffer", "capacity", "gapEnd", "gapStart", "append", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "delete", "start", "end", "gapLength", "get", "", "index", "length", "makeSureAvailableSpace", "requestSize", "replace", "text", "", "toString", "ui-text"})
/*     */ @SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
/*     */ final class GapBuffer
/*     */ {
/*     */   private int capacity;
/*     */   @NotNull
/*     */   private char[] buffer;
/*     */   private int gapStart;
/*     */   private int gapEnd;
/*     */   
/*     */   public GapBuffer(@NotNull char[] initBuffer, int initGapStart, int initGapEnd) {
/*  62 */     this.capacity = initBuffer.length;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  67 */     this.buffer = initBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     this.gapStart = initGapStart;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  77 */     this.gapEnd = initGapEnd;
/*     */   }
/*     */ 
/*     */   
/*     */   private final int gapLength() {
/*  82 */     return this.gapEnd - this.gapStart;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final char get(int index) {
/*  88 */     if (index < this.gapStart) {
/*  89 */       return this.buffer[index];
/*     */     }
/*  91 */     return this.buffer[index - this.gapStart + this.gapEnd];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void makeSureAvailableSpace(int requestSize) {
/*  99 */     if (requestSize <= gapLength()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 104 */     int necessarySpace = requestSize - gapLength();
/* 105 */     int newCapacity = this.capacity * 2;
/* 106 */     while (newCapacity - this.capacity < necessarySpace) {
/* 107 */       newCapacity *= 2;
/*     */     }
/*     */     
/* 110 */     char[] newBuffer = new char[newCapacity];
/* 111 */     ArraysKt.copyInto(this.buffer, newBuffer, 0, 0, this.gapStart);
/* 112 */     int tailLength = this.capacity - this.gapEnd;
/* 113 */     int newEnd = newCapacity - tailLength;
/* 114 */     ArraysKt.copyInto(this.buffer, newBuffer, newEnd, this.gapEnd, this.gapEnd + tailLength);
/*     */     
/* 116 */     this.buffer = newBuffer;
/* 117 */     this.capacity = newCapacity;
/* 118 */     this.gapEnd = newEnd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void delete(int start, int end) {
/* 125 */     if (start < this.gapStart && end <= this.gapStart) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 143 */       int copyLen = this.gapStart - end;
/* 144 */       ArraysKt.copyInto(this.buffer, this.buffer, this.gapEnd - copyLen, end, this.gapStart);
/* 145 */       this.gapStart = start;
/* 146 */       this.gapEnd -= copyLen;
/* 147 */     } else if (start < this.gapStart && end >= this.gapStart) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 156 */       this.gapEnd = end + gapLength();
/* 157 */       this.gapStart = start;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 176 */       int startInBuffer = start + gapLength();
/* 177 */       int endInBuffer = end + gapLength();
/* 178 */       int copyLen = startInBuffer - this.gapEnd;
/* 179 */       ArraysKt.copyInto(this.buffer, this.buffer, this.gapStart, this.gapEnd, startInBuffer);
/* 180 */       this.gapStart += copyLen;
/* 181 */       this.gapEnd = endInBuffer;
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
/*     */   public final void replace(int start, int end, @NotNull String text) {
/* 193 */     Intrinsics.checkNotNullParameter(text, "text"); makeSureAvailableSpace(text.length() - end - start);
/*     */     
/* 195 */     delete(start, end);
/*     */     
/* 197 */     GapBufferKt.access$toCharArray(text, this.buffer, this.gapStart);
/* 198 */     this.gapStart += text.length();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void append(@NotNull StringBuilder builder) {
/* 206 */     Intrinsics.checkNotNullParameter(builder, "builder"); AppendPartOfCharArrayKt.appendPartOfCharArray(builder, this.buffer, 0, this.gapStart);
/* 207 */     AppendPartOfCharArrayKt.appendPartOfCharArray(builder, this.buffer, this.gapEnd, this.capacity - this.gapEnd);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int length() {
/* 215 */     return this.capacity - gapLength(); } @NotNull
/*     */   public String toString() {
/* 217 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$toString_u24lambda_u240 = stringBuilder1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 340 */     int $i$a$-apply-GapBuffer$toString$1 = 0;
/*     */     $this$toString_u24lambda_u240.append($this$toString_u24lambda_u240);
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\GapBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */