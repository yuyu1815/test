/*    */ package kotlinx.serialization.cbor.internal;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\022\n\002\b\003\n\002\020\b\n\002\b\b\n\002\020\002\n\000\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\006\020\013\032\0020\007J\036\020\013\032\0020\0072\006\020\f\032\0020\0032\006\020\r\032\0020\0072\006\020\016\032\0020\007J\016\020\017\032\0020\0202\006\020\016\032\0020\007R\016\020\002\032\0020\003X\016¢\006\002\n\000R\016\020\006\032\0020\007X\016¢\006\002\n\000R\021\020\b\032\0020\0078F¢\006\006\032\004\b\t\020\n¨\006\021"}, d2 = {"Lkotlinx/serialization/cbor/internal/ByteArrayInput;", "", "array", "", "<init>", "([B)V", "position", "", "availableBytes", "getAvailableBytes", "()I", "read", "b", "offset", "length", "skip", "", "kotlinx-serialization-cbor"})
/*    */ public final class ByteArrayInput {
/*    */   @NotNull
/*    */   private byte[] array;
/*    */   
/*    */   public ByteArrayInput(@NotNull byte[] array) {
/*  7 */     this.array = array;
/*    */   } private int position; public final int getAvailableBytes() {
/*  9 */     return this.array.length - this.position;
/*    */   }
/*    */   public final int read() {
/* 12 */     int i = this.position; this.position = i + 1; return (this.position < this.array.length) ? (this.array[i] & 0xFF) : -1;
/*    */   }
/*    */ 
/*    */   
/*    */   public final int read(@NotNull byte[] b, int offset, int length) {
/* 17 */     Intrinsics.checkNotNullParameter(b, "b"); if (offset < 0 || offset > b.length || length < 0 || 
/* 18 */       length > b.length - offset)
/*    */     {
/* 20 */       throw new IndexOutOfBoundsException();
/*    */     }
/*    */     
/* 23 */     if (this.position >= this.array.length) {
/* 24 */       return -1;
/*    */     }
/* 26 */     if (length == 0) {
/* 27 */       return 0;
/*    */     }
/*    */     
/* 30 */     int copied = (this.array.length - this.position < length) ? (this.array.length - this.position) : length;
/* 31 */     ArraysKt.copyInto(this.array, b, offset, this.position, this.position + copied);
/* 32 */     this.position += copied;
/* 33 */     return copied;
/*    */   }
/*    */   
/*    */   public final void skip(int length) {
/* 37 */     this.position += length;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\internal\ByteArrayInput.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */