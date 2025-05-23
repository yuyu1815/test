/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.annotation.RestrictTo;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.InternalTextApi;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020\f\n\002\b\002\n\002\020\002\n\002\b\005\b\007\030\000 \0302\0020\001:\001\030B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\021\020\020\032\0020\0212\006\020\022\032\0020\006H\002J\036\020\023\032\0020\0242\006\020\025\032\0020\0062\006\020\026\032\0020\0062\006\020\002\032\0020\003J\b\020\027\032\0020\003H\026R\016\020\005\032\0020\006X\016¢\006\002\n\000R\016\020\007\032\0020\006X\016¢\006\002\n\000R\020\020\b\032\004\030\0010\tX\016¢\006\002\n\000R\021\020\n\032\0020\0068F¢\006\006\032\004\b\013\020\fR\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\004¨\006\031"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "text", "", "(Ljava/lang/String;)V", "bufEnd", "", "bufStart", "buffer", "Landroidx/compose/ui/text/input/GapBuffer;", "length", "getLength", "()I", "getText", "()Ljava/lang/String;", "setText", "get", "", "index", "replace", "", "start", "end", "toString", "Companion", "ui-text"})
/*     */ @InternalTextApi
/*     */ @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class PartialGapBuffer
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private String text;
/*     */   @Nullable
/*     */   private GapBuffer buffer;
/*     */   private int bufStart;
/*     */   private int bufEnd;
/*     */   public static final int $stable = 8;
/*     */   public static final int BUF_SIZE = 255;
/*     */   public static final int SURROUNDING_SIZE = 64;
/*     */   public static final int NOWHERE = -1;
/*     */   
/*     */   @NotNull
/*     */   public final String getText() {
/*     */     return this.text;
/*     */   }
/*     */   
/*     */   public PartialGapBuffer(@NotNull String text) {
/* 232 */     this.text = text;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 240 */     this.bufStart = -1;
/* 241 */     this.bufEnd = -1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getLength() {
/*     */     GapBuffer buffer;
/* 248 */     if (this.buffer == null) return this.text.length(); 
/* 249 */     return this.text.length() - this.bufEnd - this.bufStart + buffer.length();
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setText(@NotNull String <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.text = <set-?>;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void replace(int start, int end, @NotNull String text) {
/* 260 */     Intrinsics.checkNotNullParameter(text, "text"); if (!((start <= end) ? 1 : 0)) { int $i$a$-require-PartialGapBuffer$replace$1 = 0; String str = 
/* 261 */         "start index must be less than or equal to end index: " + start + " > " + end; throw new IllegalArgumentException(str.toString()); }
/*     */     
/* 263 */     if (!((start >= 0) ? 1 : 0)) { int $i$a$-require-PartialGapBuffer$replace$2 = 0; String str = 
/* 264 */         "start must be non-negative, but was " + start;
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/* 267 */     GapBuffer buffer = this.buffer;
/* 268 */     if (buffer == null) {
/* 269 */       char[] charArray = new char[Math.max(255, text.length() + 128)];
/*     */ 
/*     */       
/* 272 */       int leftCopyCount = Math.min(start, 64);
/* 273 */       int rightCopyCount = Math.min(this.text.length() - end, 64);
/*     */ 
/*     */       
/* 276 */       GapBuffer_jvmKt.toCharArray(this.text, charArray, 0, start - leftCopyCount, start);
/*     */ 
/*     */       
/* 279 */       GapBuffer_jvmKt.toCharArray(this.text, 
/* 280 */           charArray, 
/* 281 */           charArray.length - rightCopyCount, 
/* 282 */           end, 
/* 283 */           end + rightCopyCount);
/*     */ 
/*     */ 
/*     */       
/* 287 */       GapBufferKt.access$toCharArray(text, charArray, leftCopyCount);
/*     */       
/* 289 */       this.buffer = new GapBuffer(
/* 290 */           charArray, 
/* 291 */           leftCopyCount + text.length(), 
/* 292 */           charArray.length - rightCopyCount);
/*     */       
/* 294 */       this.bufStart = start - leftCopyCount;
/* 295 */       this.bufEnd = end + rightCopyCount;
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 300 */     int bufferStart = start - this.bufStart;
/* 301 */     int bufferEnd = end - this.bufStart;
/* 302 */     if (bufferStart < 0 || bufferEnd > buffer.length()) {
/*     */ 
/*     */       
/* 305 */       this.text = toString();
/* 306 */       this.buffer = null;
/* 307 */       this.bufStart = -1;
/* 308 */       this.bufEnd = -1;
/* 309 */       replace(start, end, text);
/*     */       return;
/*     */     } 
/* 312 */     buffer.replace(bufferStart, bufferEnd, text);
/*     */   }
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000¨\006\007"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer$Companion;", "", "()V", "BUF_SIZE", "", "NOWHERE", "SURROUNDING_SIZE", "ui-text"})
/*     */   public static final class Companion {
/*     */     private Companion() {} }
/*     */   public final char get(int index) {
/*     */     GapBuffer buffer;
/* 319 */     if (this.buffer == null) return this.text.charAt(index); 
/* 320 */     if (index < this.bufStart) {
/* 321 */       return this.text.charAt(index);
/*     */     }
/* 323 */     int gapBufLength = buffer.length();
/* 324 */     if (index < gapBufLength + this.bufStart) {
/* 325 */       return buffer.get(index - this.bufStart);
/*     */     }
/* 327 */     return this.text.charAt(index - gapBufLength - this.bufEnd + this.bufStart);
/*     */   } @NotNull
/*     */   public String toString() {
/*     */     GapBuffer b;
/* 331 */     if (this.buffer == null) return this.text; 
/* 332 */     StringBuilder sb = new StringBuilder();
/* 333 */     sb.append(this.text, 0, this.bufStart);
/* 334 */     b.append(sb);
/* 335 */     sb.append(this.text, this.bufEnd, this.text.length());
/* 336 */     Intrinsics.checkNotNullExpressionValue(sb.toString(), "toString(...)"); return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\PartialGapBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */