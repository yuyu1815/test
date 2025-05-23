/*     */ package kotlinx.serialization.json.internal;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\f\n\000\n\002\020\b\n\000\n\002\020\031\n\002\b\006\n\002\020\002\n\000\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\036\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\0212\006\020\025\032\0020\021J \020\026\032\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\0212\006\020\025\032\0020\021H\002J\b\020\027\032\0020\021H\002J\b\020\030\032\0020\021H\002J\006\020\031\032\0020\032R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\016\020\f\032\0020\rX\016¢\006\002\n\000R\016\020\016\032\0020\017X\016¢\006\002\n\000¨\006\033"}, d2 = {"Lkotlinx/serialization/json/internal/CharsetReader;", "", "inputStream", "Ljava/io/InputStream;", "charset", "Ljava/nio/charset/Charset;", "<init>", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V", "decoder", "Ljava/nio/charset/CharsetDecoder;", "byteBuffer", "Ljava/nio/ByteBuffer;", "hasLeftoverPotentiallySurrogateChar", "", "leftoverChar", "", "read", "", "array", "", "offset", "length", "doRead", "fillByteBuffer", "oneShotReadSlowPath", "release", "", "kotlinx-serialization-json"})
/*     */ public final class CharsetReader { @NotNull
/*     */   private final InputStream inputStream; @NotNull
/*     */   private final Charset charset; @NotNull
/*     */   private final CharsetDecoder decoder;
/*     */   
/*     */   public CharsetReader(@NotNull InputStream inputStream, @NotNull Charset charset) {
/*   8 */     this.inputStream = inputStream;
/*   9 */     this.charset = charset;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  19 */     this.decoder = this.charset.newDecoder()
/*  20 */       .onMalformedInput(CodingErrorAction.REPLACE)
/*  21 */       .onUnmappableCharacter(CodingErrorAction.REPLACE);
/*  22 */     this.byteBuffer = ByteBuffer.wrap(ByteArrayPool8k.INSTANCE.take());
/*  23 */     this.byteBuffer.flip();
/*     */   }
/*     */   @NotNull
/*     */   private final ByteBuffer byteBuffer; private boolean hasLeftoverPotentiallySurrogateChar; private char leftoverChar;
/*     */   public final int read(@NotNull char[] array, int offset, int length) {
/*  28 */     Intrinsics.checkNotNullParameter(array, "array"); if (length == 0) return 0; 
/*  29 */     if (!((((0 <= offset) ? ((offset < array.length)) : false) && length >= 0 && offset + length <= array.length) ? 1 : 0)) { int $i$a$-require-CharsetReader$read$1 = 0; String str = 
/*  30 */         "Unexpected arguments: " + offset + ", " + length + ", " + array.length;
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/*  33 */     int i = offset;
/*  34 */     int j = length;
/*  35 */     int bytesRead = 0;
/*  36 */     if (this.hasLeftoverPotentiallySurrogateChar) {
/*  37 */       array[i] = this.leftoverChar;
/*  38 */       i++;
/*  39 */       j--;
/*  40 */       this.hasLeftoverPotentiallySurrogateChar = false;
/*  41 */       bytesRead = 1;
/*  42 */       if (j == 0) return bytesRead; 
/*     */     } 
/*  44 */     if (j == 1) {
/*     */       
/*  46 */       int c = oneShotReadSlowPath();
/*  47 */       if (c == -1) return (bytesRead == 0) ? -1 : bytesRead; 
/*  48 */       array[i] = (char)c;
/*  49 */       return bytesRead + 1;
/*     */     } 
/*  51 */     return doRead(array, i, j) + bytesRead;
/*     */   }
/*     */   
/*     */   private final int doRead(char[] array, int offset, int length) {
/*  55 */     CharBuffer charBuffer = CharBuffer.wrap(array, offset, length);
/*  56 */     if (charBuffer.position() != 0) {
/*  57 */       charBuffer = charBuffer.slice();
/*     */     }
/*  59 */     boolean isEof = false;
/*     */     while (true) {
/*  61 */       CoderResult cr = this.decoder.decode(this.byteBuffer, charBuffer, isEof);
/*  62 */       if (cr.isUnderflow()) {
/*  63 */         if (!isEof && 
/*  64 */           charBuffer.hasRemaining()) {
/*  65 */           int n = fillByteBuffer();
/*  66 */           if (n < 0) {
/*  67 */             isEof = true;
/*  68 */             if (charBuffer.position() != 0 || this.byteBuffer.hasRemaining()) {
/*  69 */               this.decoder.reset(); continue;
/*     */             }  break;
/*     */           }  continue;
/*     */         }  break;
/*  73 */       }  if (cr.isOverflow()) {
/*  74 */         boolean bool = (charBuffer.position() > 0) ? true : false; if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/*     */          break;
/*     */       } 
/*  77 */       cr.throwException();
/*     */     } 
/*  79 */     if (isEof) this.decoder.reset(); 
/*  80 */     return (charBuffer.position() == 0) ? -1 : 
/*  81 */       charBuffer.position();
/*     */   }
/*     */   
/*     */   private final int fillByteBuffer() {
/*  85 */     this.byteBuffer.compact();
/*     */     
/*     */     try {
/*  88 */       int limit = this.byteBuffer.limit();
/*  89 */       int position = this.byteBuffer.position();
/*  90 */       int remaining = (position <= limit) ? (limit - position) : 0;
/*  91 */       int bytesRead = this.inputStream.read(this.byteBuffer.array(), this.byteBuffer.arrayOffset() + position, remaining);
/*  92 */       if (bytesRead < 0) return bytesRead;
/*     */       
/*  94 */       Intrinsics.checkNotNull(this.byteBuffer, "null cannot be cast to non-null type java.nio.Buffer"); this.byteBuffer.position(position + bytesRead);
/*     */     } finally {
/*  96 */       this.byteBuffer.flip();
/*     */     } 
/*  98 */     return this.byteBuffer.remaining();
/*     */   }
/*     */ 
/*     */   
/*     */   private final int oneShotReadSlowPath() {
/* 103 */     if (this.hasLeftoverPotentiallySurrogateChar) {
/* 104 */       this.hasLeftoverPotentiallySurrogateChar = false;
/* 105 */       return this.leftoverChar;
/*     */     } 
/*     */     
/* 108 */     char[] array = new char[2];
/* 109 */     int bytesRead = read(array, 0, 2);
/* 110 */     switch (bytesRead) { case -1: 
/*     */       case 1:
/*     */       
/*     */       case 2:
/* 114 */         this.leftoverChar = array[1];
/* 115 */         this.hasLeftoverPotentiallySurrogateChar = true; }
/* 116 */      throw new IllegalStateException((
/*     */         
/* 118 */         "Unreachable state: " + bytesRead).toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public final void release() {
/* 123 */     Intrinsics.checkNotNullExpressionValue(this.byteBuffer.array(), "array(...)"); ByteArrayPool8k.INSTANCE.release(this.byteBuffer.array());
/*     */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\CharsetReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */