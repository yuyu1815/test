/*    */ package kotlinx.serialization.cbor.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\022\n\000\n\002\020\b\n\000\n\002\020\002\n\002\b\n\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\b\032\0020\t2\006\020\n\032\0020\007H\002J\006\020\013\032\0020\005J\016\020\f\032\0020\t2\006\020\r\032\0020\000J\"\020\016\032\0020\t2\006\020\017\032\0020\0052\b\b\002\020\020\032\0020\0072\b\b\002\020\021\032\0020\007J\016\020\016\032\0020\t2\006\020\022\032\0020\007R\016\020\004\032\0020\005X\016¢\006\002\n\000R\016\020\006\032\0020\007X\016¢\006\002\n\000¨\006\023"}, d2 = {"Lkotlinx/serialization/cbor/internal/ByteArrayOutput;", "", "<init>", "()V", "array", "", "position", "", "ensureCapacity", "", "elementsToAppend", "toByteArray", "copyFrom", "src", "write", "buffer", "offset", "count", "byteValue", "kotlinx-serialization-cbor"})
/*    */ public final class ByteArrayOutput
/*    */ {
/*    */   @NotNull
/* 42 */   private byte[] array = new byte[32];
/*    */   private int position;
/*    */   
/*    */   private final void ensureCapacity(int elementsToAppend) {
/* 46 */     if (this.position + elementsToAppend <= this.array.length) {
/*    */       return;
/*    */     }
/* 49 */     byte[] newArray = new byte[Integer.highestOneBit(this.position + elementsToAppend) << 1];
/* 50 */     ArraysKt.copyInto$default(this.array, newArray, 0, 0, 0, 14, null);
/* 51 */     this.array = newArray;
/*    */   }
/*    */   @NotNull
/*    */   public final byte[] toByteArray() {
/* 55 */     byte[] newArray = new byte[this.position];
/* 56 */     ArraysKt.copyInto$default(this.array, newArray, 0, 0, this.position, 2, null);
/* 57 */     return newArray;
/*    */   }
/*    */   
/*    */   public final void copyFrom(@NotNull ByteArrayOutput src) {
/* 61 */     Intrinsics.checkNotNullParameter(src, "src"); write$default(this, src.array, 0, src.position, 2, null);
/*    */   }
/*    */ 
/*    */   
/*    */   public final void write(@NotNull byte[] buffer, int offset, int count) {
/* 66 */     Intrinsics.checkNotNullParameter(buffer, "buffer"); if (offset < 0 || offset > buffer.length || count < 0 || 
/* 67 */       count > buffer.length - offset)
/*    */     {
/* 69 */       throw new IndexOutOfBoundsException();
/*    */     }
/* 71 */     if (count == 0) {
/*    */       return;
/*    */     }
/*    */     
/* 75 */     ensureCapacity(count);
/* 76 */     ArraysKt.copyInto(buffer, 
/* 77 */         this.array, 
/* 78 */         this.position, 
/* 79 */         offset, 
/* 80 */         offset + count);
/*    */     
/* 82 */     this.position += count;
/*    */   }
/*    */   
/*    */   public final void write(int byteValue) {
/* 86 */     ensureCapacity(1);
/* 87 */     int i = this.position; this.position = i + 1; this.array[i] = (byte)byteValue;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\internal\ByteArrayOutput.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */