/*     */ package kotlinx.serialization.cbor.internal;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.SerializationException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\020\022\n\002\020\034\n\000\n\002\020\b\n\000\n\002\020\007\n\000\n\002\020\n\n\000\n\002\020\016\n\002\030\002\n\000\n\002\020\t\n\002\b\003\032\022\020\000\032\0020\001*\b\022\004\022\0020\0010\002H\002\032\020\020\005\032\0020\0062\006\020\007\032\0020\bH\002\032\026\020\t\032\004\030\0010\n*\0020\0132\006\020\f\032\0020\rH\002\032\024\020\016\032\0020\004*\0020\0132\006\020\017\032\0020\nH\002\"\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\020"}, d2 = {"flatten", "", "", "normalizeBaseBits", "", "floatFromHalfBits", "", "bits", "", "getElementNameForCborLabel", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "label", "", "getElementIndexOrThrow", "name", "kotlinx-serialization-cbor"})
/*     */ @SourceDebugExtension({"SMAP\nDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Decoder.kt\nkotlinx/serialization/cbor/internal/DecoderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,621:1\n1#2:622\n295#3,2:623\n*S KotlinDebug\n*F\n+ 1 Decoder.kt\nkotlinx/serialization/cbor/internal/DecoderKt\n*L\n607#1:623,2\n*E\n"})
/*     */ public final class DecoderKt
/*     */ {
/*     */   private static final byte[] flatten(Iterable $this$flatten) {
/* 524 */     Iterable iterable = $this$flatten; int i = 0; for (byte[] arrayOfByte1 : iterable) { byte[] arrayOfByte2 = arrayOfByte1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 622 */       int j = i, $i$a$-sumOfInt-DecoderKt$flatten$output$1 = 0;
/*     */       int k = arrayOfByte2.length;
/*     */       i = j + k; }
/*     */     
/*     */     byte[] output = new byte[i];
/*     */     int position = 0;
/*     */     for (byte[] chunk : $this$flatten) {
/*     */       ArraysKt.copyInto$default(chunk, output, position, 0, 0, 12, null);
/*     */       position += chunk.length;
/*     */     } 
/*     */     return output;
/*     */   }
/*     */   
/*     */   private static final int normalizeBaseBits = Float.floatToIntBits(0.5F);
/*     */   
/*     */   private static final float floatFromHalfBits(short bits) {
/*     */     float f1;
/*     */     int intBits = bits;
/*     */     boolean negative = ((intBits & 0x8000) != 0);
/*     */     int halfExp = intBits >> 10 & 0x1F;
/*     */     int halfMant = intBits & 0x3FF;
/*     */     int exp = 0;
/*     */     int mant = 0;
/*     */     switch (halfExp) {
/*     */       case 31:
/*     */         exp = 255;
/*     */         mant = halfMant;
/*     */         break;
/*     */       case 0:
/*     */         if (halfMant == 0) {
/*     */           mant = 0;
/*     */           exp = 0;
/*     */           break;
/*     */         } 
/*     */         f1 = Float.intBitsToFloat(normalizeBaseBits + halfMant);
/*     */         f1 -= 0.5F;
/*     */         return negative ? -f1 : f1;
/*     */       default:
/*     */         exp = halfExp + 112;
/*     */         mant = halfMant;
/*     */         break;
/*     */     } 
/*     */     float res = Float.intBitsToFloat(exp << 23 | mant << 13);
/*     */     return negative ? -res : res;
/*     */   }
/*     */   
/*     */   private static final String getElementNameForCborLabel(SerialDescriptor $this$getElementNameForCborLabel, long label) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokestatic getElementNames : (Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/Iterable;
/*     */     //   4: astore_3
/*     */     //   5: iconst_0
/*     */     //   6: istore #4
/*     */     //   8: aload_3
/*     */     //   9: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   14: astore #5
/*     */     //   16: aload #5
/*     */     //   18: invokeinterface hasNext : ()Z
/*     */     //   23: ifeq -> 90
/*     */     //   26: aload #5
/*     */     //   28: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   33: astore #6
/*     */     //   35: aload #6
/*     */     //   37: checkcast java/lang/String
/*     */     //   40: astore #7
/*     */     //   42: iconst_0
/*     */     //   43: istore #8
/*     */     //   45: aload_0
/*     */     //   46: aload_0
/*     */     //   47: aload #7
/*     */     //   49: invokeinterface getElementIndex : (Ljava/lang/String;)I
/*     */     //   54: invokestatic getCborLabel : (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Long;
/*     */     //   57: lload_1
/*     */     //   58: lstore #9
/*     */     //   60: dup
/*     */     //   61: ifnonnull -> 68
/*     */     //   64: pop
/*     */     //   65: goto -> 81
/*     */     //   68: invokevirtual longValue : ()J
/*     */     //   71: lload #9
/*     */     //   73: lcmp
/*     */     //   74: ifne -> 81
/*     */     //   77: iconst_1
/*     */     //   78: goto -> 82
/*     */     //   81: iconst_0
/*     */     //   82: ifeq -> 16
/*     */     //   85: aload #6
/*     */     //   87: goto -> 91
/*     */     //   90: aconst_null
/*     */     //   91: checkcast java/lang/String
/*     */     //   94: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #607	-> 0
/*     */     //   #623	-> 8
/*     */     //   #607	-> 45
/*     */     //   #623	-> 82
/*     */     //   #624	-> 90
/*     */     //   #607	-> 94
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   45	37	8	$i$a$-firstOrNull-DecoderKt$getElementNameForCborLabel$1	I
/*     */     //   42	40	7	it	Ljava/lang/String;
/*     */     //   35	55	6	element$iv	Ljava/lang/Object;
/*     */     //   8	83	4	$i$f$firstOrNull	I
/*     */     //   5	86	3	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */     //   0	95	0	$this$getElementNameForCborLabel	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   0	95	1	label	J
/*     */   }
/*     */   
/*     */   private static final int getElementIndexOrThrow(SerialDescriptor $this$getElementIndexOrThrow, String name) {
/*     */     int index = $this$getElementIndexOrThrow.getElementIndex(name);
/*     */     if (index == -3)
/*     */       throw new SerializationException($this$getElementIndexOrThrow.getSerialName() + " does not contain element with name '" + name + ". You can enable 'CborBuilder.ignoreUnknownKeys' property to ignore unknown keys"); 
/*     */     return index;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\internal\DecoderKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */