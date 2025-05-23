/*     */ package kotlinx.serialization.cbor.internal;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.UInt;
/*     */ import kotlin.ULong;
/*     */ import kotlin.UnsignedKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000`\n\000\n\002\020!\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\b\n\002\b\002\n\002\020\t\n\002\b\002\n\002\020\022\n\000\n\002\020\016\n\002\b\003\n\002\020\007\n\000\n\002\020\006\n\002\b\r\n\002\020\005\n\002\b\004\032\032\020\000\032\f\022\004\022\0020\0020\001j\002`\0032\006\020\004\032\0020\002H\002\032\036\020\005\032\0020\006*\f\022\004\022\0020\0020\001j\002`\0032\006\020\007\032\0020\002H\002\032\026\020\b\032\0020\002*\f\022\004\022\0020\0020\001j\002`\003H\002\032\026\020\t\032\0020\002*\f\022\004\022\0020\0020\001j\002`\003H\002\032\f\020\n\032\0020\013*\0020\fH\002\032\033\020\n\032\0020\013*\0020\f2\006\020\r\032\0020\016H\002¢\006\004\b\017\020\020\032\f\020\021\032\0020\013*\0020\fH\002\032\033\020\021\032\0020\013*\0020\f2\006\020\r\032\0020\016H\002¢\006\004\b\022\020\020\032\033\020\023\032\0020\013*\0020\f2\006\020\024\032\0020\016H\002¢\006\004\b\025\020\020\032\f\020\026\032\0020\013*\0020\fH\000\032\f\020\027\032\0020\013*\0020\fH\000\032\f\020\030\032\0020\013*\0020\fH\000\032\024\020\031\032\0020\013*\0020\f2\006\020\032\032\0020\033H\000\032\024\020\034\032\0020\013*\0020\f2\006\020\007\032\0020\006H\000\032\024\020\035\032\0020\013*\0020\f2\006\020\007\032\0020\036H\000\032\024\020\037\032\0020\013*\0020\f2\006\020 \032\0020!H\000\032\024\020\"\032\0020\013*\0020\f2\006\020\007\032\0020#H\000\032\034\020$\032\0020\013*\0020\f2\006\020 \032\0020!2\006\020%\032\0020\033H\000\032\024\020&\032\0020\013*\0020\f2\006\020\007\032\0020'H\000\032\024\020(\032\0020\013*\0020\f2\006\020\007\032\0020)H\000\032\020\020*\032\0020!2\006\020\007\032\0020\036H\002\032#\020+\032\0020\013*\0020\f2\006\020\007\032\0020\0162\006\020,\032\0020\033H\002¢\006\004\b-\020.\032\027\020/\032\0020!2\006\020\007\032\0020\016H\002¢\006\004\b0\0201\032+\0202\032\0020\013*\0020\f2\006\020\007\032\0020\0162\006\0203\032\0020\0332\006\020\024\032\0020\033H\002¢\006\004\b4\0205\032'\0206\032\0020!2\006\020\007\032\0020\0162\006\0203\032\0020\0332\006\020\024\032\00207H\002¢\006\004\b8\0209\032\020\020:\032\0020!2\006\020\007\032\0020\036H\002*\030\b\002\020\000\"\b\022\004\022\0020\0020\0012\b\022\004\022\0020\0020\001¨\006;"}, d2 = {"Stack", "", "Lkotlinx/serialization/cbor/internal/CborWriter$Data;", "Lkotlinx/serialization/cbor/internal/Stack;", "initial", "push", "", "value", "pop", "peek", "startArray", "", "Lkotlinx/serialization/cbor/internal/ByteArrayOutput;", "size", "Lkotlin/ULong;", "startArray-2TYgG_w", "(Lkotlinx/serialization/cbor/internal/ByteArrayOutput;J)V", "startMap", "startMap-2TYgG_w", "encodeTag", "tag", "encodeTag-2TYgG_w", "end", "encodeNull", "encodeEmptyMap", "writeByte", "byteValue", "", "encodeBoolean", "encodeNumber", "", "encodeByteString", "data", "", "encodeString", "", "encodeByteArray", "type", "encodeFloat", "", "encodeDouble", "", "composeNumber", "composePositiveInline", "mod", "composePositiveInline-z13BHRw", "(Lkotlinx/serialization/cbor/internal/ByteArrayOutput;JI)V", "composePositive", "composePositive-VKZWuLQ", "(J)[B", "encodeToInline", "bytes", "encodeToInline-32etgaw", "(Lkotlinx/serialization/cbor/internal/ByteArrayOutput;JII)V", "encodeToByteArray", "", "encodeToByteArray-E0BElUM", "(JIB)[B", "composeNegative", "kotlinx-serialization-cbor"})
/*     */ public final class EncoderKt
/*     */ {
/*     */   private static final List<CborWriter.Data> Stack(CborWriter.Data initial) {
/*  20 */     CborWriter.Data[] arrayOfData = new CborWriter.Data[1]; arrayOfData[0] = initial; return CollectionsKt.mutableListOf((Object[])arrayOfData);
/*  21 */   } private static final boolean push(List<CborWriter.Data> $this$push, CborWriter.Data value) { return $this$push.add(value); }
/*  22 */   private static final CborWriter.Data pop(List $this$pop) { return (CborWriter.Data)CollectionsKt.removeLast($this$pop); } private static final CborWriter.Data peek(List $this$peek) {
/*  23 */     return (CborWriter.Data)CollectionsKt.last($this$peek);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void startArray(ByteArrayOutput $this$startArray) {
/* 225 */     $this$startArray.write(159);
/*     */   }
/*     */   private static final void startArray-2TYgG_w(ByteArrayOutput $this$startArray_u2d2TYgG_w, long size) {
/* 228 */     composePositiveInline-z13BHRw($this$startArray_u2d2TYgG_w, size, 128);
/*     */   }
/*     */   private static final void startMap(ByteArrayOutput $this$startMap) {
/* 231 */     $this$startMap.write(191);
/*     */   }
/*     */   private static final void startMap-2TYgG_w(ByteArrayOutput $this$startMap_u2d2TYgG_w, long size) {
/* 234 */     composePositiveInline-z13BHRw($this$startMap_u2d2TYgG_w, size, 160);
/*     */   }
/*     */   
/*     */   private static final void encodeTag-2TYgG_w(ByteArrayOutput $this$encodeTag_u2d2TYgG_w, long tag) {
/* 238 */     composePositiveInline-z13BHRw($this$encodeTag_u2d2TYgG_w, tag, 192);
/*     */   }
/*     */   public static final void end(@NotNull ByteArrayOutput $this$end) {
/* 241 */     Intrinsics.checkNotNullParameter($this$end, "<this>"); $this$end.write(255);
/*     */   } public static final void encodeNull(@NotNull ByteArrayOutput $this$encodeNull) {
/* 243 */     Intrinsics.checkNotNullParameter($this$encodeNull, "<this>"); $this$encodeNull.write(246);
/*     */   } public static final void encodeEmptyMap(@NotNull ByteArrayOutput $this$encodeEmptyMap) {
/* 245 */     Intrinsics.checkNotNullParameter($this$encodeEmptyMap, "<this>"); $this$encodeEmptyMap.write(160);
/*     */   } public static final void writeByte(@NotNull ByteArrayOutput $this$writeByte, int byteValue) {
/* 247 */     Intrinsics.checkNotNullParameter($this$writeByte, "<this>"); $this$writeByte.write(byteValue);
/*     */   } public static final void encodeBoolean(@NotNull ByteArrayOutput $this$encodeBoolean, boolean value) {
/* 249 */     Intrinsics.checkNotNullParameter($this$encodeBoolean, "<this>"); $this$encodeBoolean.write(value ? 245 : 244);
/*     */   } public static final void encodeNumber(@NotNull ByteArrayOutput $this$encodeNumber, long value) {
/* 251 */     Intrinsics.checkNotNullParameter($this$encodeNumber, "<this>"); ByteArrayOutput.write$default($this$encodeNumber, composeNumber(value), 0, 0, 6, null);
/*     */   }
/*     */   public static final void encodeByteString(@NotNull ByteArrayOutput $this$encodeByteString, @NotNull byte[] data) {
/* 254 */     Intrinsics.checkNotNullParameter($this$encodeByteString, "<this>"); Intrinsics.checkNotNullParameter(data, "data"); encodeByteArray($this$encodeByteString, data, 64);
/*     */   }
/*     */   
/*     */   public static final void encodeString(@NotNull ByteArrayOutput $this$encodeString, @NotNull String value) {
/* 258 */     Intrinsics.checkNotNullParameter($this$encodeString, "<this>"); Intrinsics.checkNotNullParameter(value, "value"); encodeByteArray($this$encodeString, StringsKt.encodeToByteArray(value), 96);
/*     */   }
/*     */   
/*     */   public static final void encodeByteArray(@NotNull ByteArrayOutput $this$encodeByteArray, @NotNull byte[] data, int type) {
/* 262 */     Intrinsics.checkNotNullParameter($this$encodeByteArray, "<this>"); Intrinsics.checkNotNullParameter(data, "data"); composePositiveInline-z13BHRw($this$encodeByteArray, ULong.constructor-impl(data.length), type);
/* 263 */     ByteArrayOutput.write$default($this$encodeByteArray, data, 0, 0, 6, null);
/*     */   }
/*     */   
/*     */   public static final void encodeFloat(@NotNull ByteArrayOutput $this$encodeFloat, float value) {
/* 267 */     Intrinsics.checkNotNullParameter($this$encodeFloat, "<this>"); $this$encodeFloat.write(250);
/* 268 */     int bits = Float.floatToRawIntBits(value);
/* 269 */     for (int i = 0; i < 4; i++) {
/* 270 */       $this$encodeFloat.write(bits >> 24 - 8 * i & 0xFF);
/*     */     }
/*     */   }
/*     */   
/*     */   public static final void encodeDouble(@NotNull ByteArrayOutput $this$encodeDouble, double value) {
/* 275 */     Intrinsics.checkNotNullParameter($this$encodeDouble, "<this>"); $this$encodeDouble.write(251);
/* 276 */     long bits = Double.doubleToRawLongBits(value);
/* 277 */     for (int i = 0; i < 8; i++) {
/* 278 */       $this$encodeDouble.write((int)(bits >> 56 - 8 * i & 0xFFL));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static final byte[] composeNumber(long value) {
/* 284 */     return (value >= 0L) ? composePositive-VKZWuLQ(ULong.constructor-impl(value)) : composeNegative(value);
/*     */   } private static final void composePositiveInline-z13BHRw(ByteArrayOutput $this$composePositiveInline_u2dz13BHRw, long value, int mod) {
/* 286 */     long l = value;
/* 287 */     if ((0 <= UnsignedKt.ulongCompare(l, ULong.constructor-impl(0x0L & 0xFFFFFFFFL))) ? ((UnsignedKt.ulongCompare(l, ULong.constructor-impl(23L & 0xFFFFFFFFL)) <= 0)) : false) { writeByte($this$composePositiveInline_u2dz13BHRw, (int)value | mod); }
/* 288 */     else if ((0 <= UnsignedKt.ulongCompare(l, ULong.constructor-impl(24L & 0xFFFFFFFFL))) ? ((UnsignedKt.ulongCompare(l, ULong.constructor-impl(UInt.constructor-impl(0xFFFFFFFF & 0xFF) & 0xFFFFFFFFL)) <= 0)) : false)
/* 289 */     { writeByte($this$composePositiveInline_u2dz13BHRw, 0x18 | mod);
/* 290 */       writeByte($this$composePositiveInline_u2dz13BHRw, (int)value); }
/*     */     else
/*     */     
/* 293 */     { int i = UInt.constructor-impl(UInt.constructor-impl(0xFFFFFFFF & 0xFF) + 1); if ((UnsignedKt.ulongCompare(l, ULong.constructor-impl(UInt.constructor-impl(0xFFFFFFFF & 0xFFFF) & 0xFFFFFFFFL)) <= 0) ? ((0 <= UnsignedKt.ulongCompare(l, ULong.constructor-impl(i & 0xFFFFFFFFL)))) : false) { encodeToInline-32etgaw($this$composePositiveInline_u2dz13BHRw, value, 2, 0x19 | mod); }
/* 294 */       else if ((0 <= UnsignedKt.ulongCompare(l, ULong.constructor-impl(UInt.constructor-impl(UInt.constructor-impl(0xFFFFFFFF & 0xFFFF) + 1) & 0xFFFFFFFFL))) ? ((UnsignedKt.ulongCompare(l, ULong.constructor-impl(-1L & 0xFFFFFFFFL)) <= 0)) : false) { encodeToInline-32etgaw($this$composePositiveInline_u2dz13BHRw, value, 4, 0x1A | mod); }
/* 295 */       else { encodeToInline-32etgaw($this$composePositiveInline_u2dz13BHRw, value, 8, 0x1B | mod); }
/*     */        }
/*     */   
/*     */   } private static final byte[] composePositive-VKZWuLQ(long value) {
/* 299 */     long l = value;
/* 300 */     byte[] arrayOfByte = new byte[1]; arrayOfByte[0] = (byte)(int)value;
/* 301 */     arrayOfByte = new byte[2]; arrayOfByte[0] = 24; arrayOfByte[1] = (byte)(int)value;
/* 302 */     int i = UInt.constructor-impl(UInt.constructor-impl(0xFFFFFFFF & 0xFF) + 1); return ((0 <= UnsignedKt.ulongCompare(l, ULong.constructor-impl(0x0L & 0xFFFFFFFFL))) ? ((UnsignedKt.ulongCompare(l, ULong.constructor-impl(23L & 0xFFFFFFFFL)) <= 0)) : false) ? arrayOfByte : (((0 <= UnsignedKt.ulongCompare(l, ULong.constructor-impl(24L & 0xFFFFFFFFL))) ? ((UnsignedKt.ulongCompare(l, ULong.constructor-impl(UInt.constructor-impl(0xFFFFFFFF & 0xFF) & 0xFFFFFFFFL)) <= 0)) : false) ? arrayOfByte : (((UnsignedKt.ulongCompare(l, ULong.constructor-impl(UInt.constructor-impl(0xFFFFFFFF & 0xFFFF) & 0xFFFFFFFFL)) <= 0) ? ((0 <= UnsignedKt.ulongCompare(l, ULong.constructor-impl(i & 0xFFFFFFFFL)))) : false) ? encodeToByteArray-E0BElUM(value, 2, (byte)25) : (
/* 303 */       ((0 <= UnsignedKt.ulongCompare(l, ULong.constructor-impl(UInt.constructor-impl(UInt.constructor-impl(0xFFFFFFFF & 0xFFFF) + 1) & 0xFFFFFFFFL))) ? ((UnsignedKt.ulongCompare(l, ULong.constructor-impl(-1L & 0xFFFFFFFFL)) <= 0)) : false) ? encodeToByteArray-E0BElUM(value, 4, (byte)26) : 
/* 304 */       encodeToByteArray-E0BElUM(value, 8, (byte)27))));
/*     */   }
/*     */ 
/*     */   
/*     */   private static final void encodeToInline-32etgaw(ByteArrayOutput $this$encodeToInline_u2d32etgaw, long value, int bytes, int tag) {
/* 309 */     int limit = bytes * 8 - 8;
/* 310 */     writeByte($this$encodeToInline_u2d32etgaw, tag);
/* 311 */     for (int i = 0; i < bytes; i++) {
/* 312 */       writeByte($this$encodeToInline_u2d32etgaw, (int)ULong.constructor-impl(ULong.constructor-impl(value >>> limit - 8 * i) & 0xFFL));
/*     */     }
/*     */   }
/*     */   
/*     */   private static final byte[] encodeToByteArray-E0BElUM(long value, int bytes, byte tag) {
/* 317 */     byte[] result = new byte[bytes + 1];
/* 318 */     int limit = bytes * 8 - 8;
/* 319 */     result[0] = tag;
/* 320 */     for (int i = 0; i < bytes; i++) {
/* 321 */       result[i + 1] = (byte)(int)ULong.constructor-impl(ULong.constructor-impl(value >>> limit - 8 * i) & 0xFFL);
/*     */     }
/* 323 */     return result;
/*     */   }
/*     */   
/*     */   private static final byte[] composeNegative(long value) {
/* 327 */     long aVal = (value == Long.MIN_VALUE) ? Long.MAX_VALUE : (-1L - value);
/* 328 */     byte[] data = composePositive-VKZWuLQ(ULong.constructor-impl(aVal));
/* 329 */     data[0] = (byte)(data[0] | 0x20);
/* 330 */     return data;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\internal\EncoderKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */