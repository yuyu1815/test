/*     */ package kotlinx.serialization.cbor.internal;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.Triple;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.ULong;
/*     */ import kotlin.ULongArray;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.UCollectionsKt;
/*     */ import kotlin.collections.unsigned.UArraysKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000z\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\003\n\002\020\001\n\000\n\002\030\002\n\002\b\016\n\002\020\016\n\002\b\005\n\002\020\022\n\002\b\006\n\002\030\002\n\002\b\013\n\002\030\002\n\002\020\t\n\002\b\t\n\002\020\007\n\002\b\003\n\002\020\006\n\002\b\004\n\002\020\n\n\002\b\006\n\002\020!\n\002\b\004\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\n\032\0020\tH\002J\006\020\013\032\0020\005J\020\020\f\032\0020\r2\006\020\016\032\0020\tH\002J\006\020\017\032\0020\005J\033\020\020\032\004\030\0010\0212\n\b\002\020\022\032\004\030\0010\023¢\006\004\b\024\020\025J\031\020\026\032\0020\0052\n\b\002\020\022\032\004\030\0010\023¢\006\004\b\027\020\030J\031\020\031\032\0020\t2\n\b\002\020\022\032\004\030\0010\023¢\006\004\b\032\020\033J\031\020\034\032\0020\t2\n\b\002\020\022\032\004\030\0010\023¢\006\004\b\035\020\033J1\020\036\032\0020\t2\b\020\022\032\004\030\0010\0232\006\020\037\032\0020\t2\006\020 \032\0020\t2\006\020!\032\0020\"H\002¢\006\004\b#\020$J\006\020%\032\0020\005J\006\020&\032\0020\rJ\031\020'\032\0020(2\n\b\002\020\022\032\004\030\0010\023¢\006\004\b)\020*J\031\020+\032\0020\"2\n\b\002\020\022\032\004\030\0010\023¢\006\004\b,\020-J'\020.\032\020\022\004\022\0020\"\022\006\022\004\030\0010\0230/2\b\020\022\032\004\030\0010\023H\002¢\006\004\b0\0201J\b\0202\032\0020(H\002J\033\0203\032\004\030\0010\0232\b\020\022\032\004\030\0010\023H\002¢\006\004\b4\0205J!\0206\032\0020\r2\006\020\016\032\0020\0232\b\0207\032\004\030\0010\023H\000¢\006\004\b8\0209J\036\020:\032\032\022\006\022\004\030\0010\"\022\006\022\004\030\0010<\022\006\022\004\030\0010\0230;J\031\020=\032\0020<2\n\b\002\020\022\032\004\030\0010\023¢\006\004\b>\020?J\b\020@\032\0020<H\002J\024\020A\032\0020<*\0020\0032\006\020B\032\0020\tH\002J\024\020C\032\0020(*\0020\0032\006\020D\032\0020\tH\002J\031\020E\032\0020F2\n\b\002\020\022\032\004\030\0010\023¢\006\004\bG\020HJ\031\020I\032\0020J2\n\b\002\020\022\032\004\030\0010\023¢\006\004\bK\020LJ\b\020M\032\0020<H\002J\b\020N\032\0020OH\002J\b\020P\032\0020\tH\002J\027\020Q\032\0020\r2\b\020\022\032\004\030\0010\023¢\006\004\bR\020SJ\026\020T\032\0020\r2\f\020U\032\b\022\004\022\0020\t0VH\002J\b\020W\032\0020\005H\002J\b\020X\032\0020\tH\002J\b\020Y\032\0020(H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\tX\016¢\006\002\n\000¨\006Z"}, d2 = {"Lkotlinx/serialization/cbor/internal/CborParser;", "", "input", "Lkotlinx/serialization/cbor/internal/ByteArrayInput;", "verifyObjectTags", "", "<init>", "(Lkotlinx/serialization/cbor/internal/ByteArrayInput;Z)V", "curByte", "", "readByte", "isEof", "skipByte", "", "expected", "isNull", "nextNull", "", "tags", "Lkotlin/ULongArray;", "nextNull-uLth9ew", "([J)Ljava/lang/Void;", "nextBoolean", "nextBoolean-uLth9ew", "([J)Z", "startArray", "startArray-uLth9ew", "([J)I", "startMap", "startMap-uLth9ew", "startSized", "unboundedHeader", "boundedHeaderMask", "collectionType", "", "startSized-kvxxsfM", "([JIILjava/lang/String;)I", "isEnd", "end", "nextByteString", "", "nextByteString-uLth9ew", "([J)[B", "nextString", "nextString-uLth9ew", "([J)Ljava/lang/String;", "nextTaggedString", "Lkotlin/Pair;", "nextTaggedString-uLth9ew", "([J)Lkotlin/Pair;", "readBytes", "processTags", "processTags-_7fx0C0", "([J)[J", "verifyTagsAndThrow", "actual", "verifyTagsAndThrow-EOCRwWE$kotlinx_serialization_cbor", "([J[J)V", "nextTaggedStringOrNumber", "Lkotlin/Triple;", "", "nextNumber", "nextNumber-uLth9ew", "([J)J", "readNumber", "readExact", "bytes", "readExactNBytes", "bytesCount", "nextFloat", "", "nextFloat-uLth9ew", "([J)F", "nextDouble", "", "nextDouble-uLth9ew", "([J)D", "readLong", "readShort", "", "readInt", "skipElement", "skipElement-uLth9ew", "([J)V", "prune", "lengthStack", "", "isIndefinite", "elementLength", "readIndefiniteLengthBytes", "kotlinx-serialization-cbor"})
/*     */ public final class CborParser
/*     */ {
/*     */   @NotNull
/*     */   private final ByteArrayInput input;
/*     */   private final boolean verifyObjectTags;
/*     */   private int curByte;
/*     */   
/*     */   public CborParser(@NotNull ByteArrayInput input, boolean verifyObjectTags) {
/* 154 */     this.input = input; this.verifyObjectTags = verifyObjectTags;
/* 155 */     this.curByte = -1;
/*     */ 
/*     */     
/* 158 */     readByte();
/*     */   }
/*     */   
/*     */   private final int readByte() {
/* 162 */     this.curByte = this.input.read();
/* 163 */     return this.curByte;
/*     */   }
/*     */   public final boolean isEof() {
/* 166 */     return (this.curByte == -1);
/*     */   }
/*     */   private final void skipByte(int expected) {
/* 169 */     if (this.curByte != expected) throw CborDecodingExceptionKt.CborDecodingException("byte " + CborDecodingExceptionKt.printByte(expected), this.curByte); 
/* 170 */     readByte();
/*     */   }
/*     */   public final boolean isNull() {
/* 173 */     return (this.curByte == 246 || this.curByte == 160);
/*     */   } @Nullable
/*     */   public final Void nextNull-uLth9ew(@Nullable long[] tags) {
/* 176 */     processTags-_7fx0C0(tags);
/* 177 */     if (this.curByte == 246) {
/* 178 */       skipByte(246);
/* 179 */     } else if (this.curByte == 160) {
/* 180 */       skipByte(160);
/*     */     } 
/* 182 */     return null;
/*     */   }
/*     */   
/*     */   public final boolean nextBoolean-uLth9ew(@Nullable long[] tags) {
/* 186 */     processTags-_7fx0C0(tags);
/* 187 */     switch (this.curByte) { case 245:
/*     */       
/*     */       case 244:
/* 190 */        }  throw CborDecodingExceptionKt.CborDecodingException("boolean value", this.curByte);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int startArray-uLth9ew(@Nullable long[] tags) {
/* 196 */     return startSized-kvxxsfM(tags, 159, 128, "array");
/*     */   } public final int startMap-uLth9ew(@Nullable long[] tags) {
/* 198 */     return startSized-kvxxsfM(tags, 191, 160, "map");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int startSized-kvxxsfM(long[] tags, int unboundedHeader, int boundedHeaderMask, String collectionType) {
/* 206 */     processTags-_7fx0C0(tags);
/* 207 */     if (this.curByte == unboundedHeader) {
/* 208 */       skipByte(unboundedHeader);
/* 209 */       return -1;
/*     */     } 
/* 211 */     if ((this.curByte & 0xE0) != boundedHeaderMask)
/* 212 */       throw CborDecodingExceptionKt.CborDecodingException("start of " + collectionType, this.curByte); 
/* 213 */     int size = (int)readNumber();
/* 214 */     readByte();
/* 215 */     return size;
/*     */   }
/*     */   public final boolean isEnd() {
/* 218 */     return (this.curByte == 255);
/*     */   } public final void end() {
/* 220 */     skipByte(255);
/*     */   } @NotNull
/*     */   public final byte[] nextByteString-uLth9ew(@Nullable long[] tags) {
/* 223 */     processTags-_7fx0C0(tags);
/* 224 */     if ((this.curByte & 0xE0) != 64)
/* 225 */       throw CborDecodingExceptionKt.CborDecodingException("start of byte string", this.curByte); 
/* 226 */     byte[] arr = readBytes();
/* 227 */     readByte();
/* 228 */     return arr;
/*     */   } @NotNull
/*     */   public final String nextString-uLth9ew(@Nullable long[] tags) {
/* 231 */     return (String)nextTaggedString-uLth9ew(tags).getFirst();
/*     */   }
/*     */   
/*     */   private final Pair<String, ULongArray> nextTaggedString-uLth9ew(long[] tags) {
/* 235 */     long[] collectedTags = processTags-_7fx0C0(tags);
/* 236 */     if ((this.curByte & 0xE0) != 96)
/* 237 */       throw CborDecodingExceptionKt.CborDecodingException("start of string", this.curByte); 
/* 238 */     byte[] arr = readBytes();
/* 239 */     String ans = StringsKt.decodeToString(arr);
/* 240 */     readByte();
/* 241 */     return TuplesKt.to(ans, (collectedTags != null) ? ULongArray.box-impl(collectedTags) : null);
/*     */   }
/*     */ 
/*     */   
/*     */   private final byte[] readBytes() {
/* 246 */     readByte();
/*     */ 
/*     */     
/* 249 */     int strLen = (int)readNumber();
/* 250 */     return ((this.curByte & 0x1F) == 31) ? readIndefiniteLengthBytes() : readExactNBytes(this.input, strLen);
/*     */   }
/*     */   
/*     */   private final long[] processTags-_7fx0C0(long[] tags) {
/* 254 */     int index = 0;
/* 255 */     List<ULong> collectedTags = new ArrayList();
/* 256 */     while ((this.curByte & 0xE0) == 192) {
/* 257 */       long readTag = ULong.constructor-impl(readNumber()); ULong uLong = ULong.box-impl(readTag);
/* 258 */       collectedTags.add(uLong);
/*     */ 
/*     */       
/* 261 */       if (this.verifyObjectTags) {
/* 262 */         long[] arrayOfLong = tags; int $i$a$-let-CborParser$processTags$1 = 0;
/* 263 */         int i = index; index = i + 1; if (i >= ULongArray.getSize-impl(arrayOfLong)) throw new CborDecodingException("More tags found than the " + ULongArray.getSize-impl(arrayOfLong) + " tags specified");
/*     */       
/*     */       } 
/* 266 */       readByte();
/*     */     } 
/* 268 */     collectedTags.isEmpty() ? null : UCollectionsKt.toULongArray(collectedTags); ULongArray uLongArray = ((collectedTags.isEmpty() ? null : UCollectionsKt.toULongArray(collectedTags)) != null) ? ULongArray.box-impl(collectedTags.isEmpty() ? null : UCollectionsKt.toULongArray(collectedTags)) : null; long[] collected = (uLongArray != null) ? uLongArray.unbox-impl() : null; int $i$a$-also-CborParser$processTags$2 = 0;
/*     */     
/* 270 */     long[] it = tags; int $i$a$-let-CborParser$processTags$2$1 = 0;
/* 271 */     if (this.verifyObjectTags) {
/* 272 */       verifyTagsAndThrow-EOCRwWE$kotlinx_serialization_cbor(it, collected);
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 277 */     else if (collectedTags.size() < ULongArray.getSize-impl(it) || 
/* 278 */       !Intrinsics.areEqual(collectedTags.subList(0, ULongArray.getSize-impl(it)), UArraysKt.asList-QwZRm1k(it))) {
/* 279 */       throw new CborDecodingException("CBOR tags " + collectedTags + " do not start with specified tags " + ULongArray.toString-impl(it));
/*     */     } 
/*     */     return (uLongArray != null) ? uLongArray.unbox-impl() : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void verifyTagsAndThrow-EOCRwWE$kotlinx_serialization_cbor(@NotNull long[] expected, @Nullable long[] actual) {
/* 286 */     Intrinsics.checkNotNullParameter(expected, "expected"); if (!UArraysKt.contentEquals-lec5QzE(expected, actual)) {
/* 287 */       throw new CborDecodingException(
/* 288 */           "CBOR tags " + ((actual != null) ? UArraysKt.contentToString-uLth9ew(actual) : null) + " do not match expected tags " + UArraysKt.contentToString-uLth9ew(expected));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Triple<String, Long, ULongArray> nextTaggedStringOrNumber() {
/* 296 */     long[] collectedTags = processTags-_7fx0C0(null);
/* 297 */     if ((this.curByte & 0xE0) == 96) {
/* 298 */       byte[] arr = readBytes();
/* 299 */       String ans = StringsKt.decodeToString(arr);
/* 300 */       readByte();
/* 301 */       return new Triple(ans, null, (collectedTags != null) ? ULongArray.box-impl(collectedTags) : null);
/*     */     } 
/* 303 */     long res = readNumber();
/* 304 */     readByte();
/* 305 */     return new Triple(null, Long.valueOf(res), (collectedTags != null) ? ULongArray.box-impl(collectedTags) : null);
/*     */   }
/*     */ 
/*     */   
/*     */   public final long nextNumber-uLth9ew(@Nullable long[] tags) {
/* 310 */     processTags-_7fx0C0(tags);
/* 311 */     long res = readNumber();
/* 312 */     readByte();
/* 313 */     return res;
/*     */   }
/*     */   
/*     */   private final long readNumber() {
/* 317 */     int value = this.curByte & 0x1F;
/* 318 */     boolean negative = ((this.curByte & 0xE0) == 32);
/* 319 */     switch (value) { case 24: case 25: case 26: case 27: default: break; }  int bytesToRead = 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 324 */       0;
/*     */     
/* 326 */     if (bytesToRead == 0) {
/* 327 */       return negative ? -((value + 1)) : 
/* 328 */         value;
/*     */     }
/* 330 */     long res = readExact(this.input, bytesToRead);
/* 331 */     return negative ? -(res + 1L) : 
/* 332 */       res;
/*     */   }
/*     */   
/*     */   private final long readExact(ByteArrayInput $this$readExact, int bytes) {
/* 336 */     byte[] arr = readExactNBytes($this$readExact, bytes);
/* 337 */     long result = 0L;
/* 338 */     for (int i = 0; i < bytes; i++) {
/* 339 */       result = result << 8L | (arr[i] & 0xFF);
/*     */     }
/* 341 */     return result;
/*     */   }
/*     */   
/*     */   private final byte[] readExactNBytes(ByteArrayInput $this$readExactNBytes, int bytesCount) {
/* 345 */     if (bytesCount > $this$readExactNBytes.getAvailableBytes()) throw new IllegalStateException((
/* 346 */           "Unexpected EOF, available " + $this$readExactNBytes.getAvailableBytes() + " bytes, requested: " + bytesCount).toString());
/*     */     
/* 348 */     byte[] array = new byte[bytesCount];
/* 349 */     $this$readExactNBytes.read(array, 0, bytesCount);
/* 350 */     return array;
/*     */   }
/*     */   
/*     */   public final float nextFloat-uLth9ew(@Nullable long[] tags) {
/* 354 */     processTags-_7fx0C0(tags);
/* 355 */     switch (this.curByte) { case 250:
/*     */       
/*     */       case 249:
/* 358 */        }  throw CborDecodingExceptionKt.CborDecodingException("float header", this.curByte);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final double nextDouble-uLth9ew(@Nullable long[] tags) {
/* 365 */     processTags-_7fx0C0(tags);
/* 366 */     switch (this.curByte) { case 251: 
/*     */       case 250:
/*     */       
/*     */       case 249:
/* 370 */        }  throw CborDecodingExceptionKt.CborDecodingException("double header", this.curByte);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final long readLong() {
/* 377 */     long result = 0L;
/* 378 */     for (int i = 0; i < 8; i++) {
/* 379 */       int byte = this.input.read();
/* 380 */       result = result << 8L | byte;
/*     */     } 
/* 382 */     return result;
/*     */   }
/*     */   
/*     */   private final short readShort() {
/* 386 */     int highByte = this.input.read();
/* 387 */     int lowByte = this.input.read();
/* 388 */     return (short)(highByte << 8 | lowByte);
/*     */   }
/*     */   
/*     */   private final int readInt() {
/* 392 */     int result = 0;
/* 393 */     for (int i = 0; i < 4; i++) {
/* 394 */       int byte = this.input.read();
/* 395 */       result = result << 8 | byte;
/*     */     } 
/* 397 */     return result;
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
/*     */   public final void skipElement-uLth9ew(@Nullable long[] tags) {
/* 413 */     List<Integer> lengthStack = new ArrayList();
/*     */     
/* 415 */     processTags-_7fx0C0(tags);
/*     */     
/*     */     while (true) {
/* 418 */       if (isEof()) throw new CborDecodingException("Unexpected EOF while skipping element");
/*     */       
/* 420 */       if (isIndefinite())
/* 421 */       { lengthStack.add(Integer.valueOf(-1)); }
/* 422 */       else { if (isEnd())
/* 423 */         { byte b = -1; if ((Integer)CollectionsKt.removeLastOrNull(lengthStack) == null) { (Integer)CollectionsKt.removeLastOrNull(lengthStack); } else { if (((Integer)CollectionsKt.removeLastOrNull(lengthStack)).intValue() != b)
/* 424 */               throw CborDecodingExceptionKt.CborDecodingException("next data item", this.curByte); 
/* 425 */             prune(lengthStack);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 440 */             readByte(); }  throw CborDecodingExceptionKt.CborDecodingException("next data item", this.curByte); }  int header = this.curByte & 0xE0; int length = elementLength(); switch (header) { case 192: readNumber(); break;case 128: case 160: if (length > 0) { lengthStack.add(Integer.valueOf(length)); break; }  prune(lengthStack); break;default: this.input.skip(length); prune(lengthStack); break; }  }  readByte();
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
/*     */   private final void prune(List<Integer> lengthStack) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */     //   4: istore_2
/*     */     //   5: iconst_m1
/*     */     //   6: iload_2
/*     */     //   7: if_icmpge -> 103
/*     */     //   10: aload_1
/*     */     //   11: iload_2
/*     */     //   12: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   17: checkcast java/lang/Number
/*     */     //   20: invokevirtual intValue : ()I
/*     */     //   23: tableswitch default -> 67, -1 -> 48, 0 -> 67, 1 -> 51
/*     */     //   48: goto -> 103
/*     */     //   51: aload_1
/*     */     //   52: iload_2
/*     */     //   53: invokeinterface remove : (I)Ljava/lang/Object;
/*     */     //   58: checkcast java/lang/Number
/*     */     //   61: invokevirtual intValue : ()I
/*     */     //   64: goto -> 96
/*     */     //   67: aload_1
/*     */     //   68: iload_2
/*     */     //   69: aload_1
/*     */     //   70: iload_2
/*     */     //   71: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   76: checkcast java/lang/Number
/*     */     //   79: invokevirtual intValue : ()I
/*     */     //   82: iconst_1
/*     */     //   83: isub
/*     */     //   84: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   87: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   92: pop
/*     */     //   93: goto -> 103
/*     */     //   96: pop
/*     */     //   97: iinc #2, -1
/*     */     //   100: goto -> 5
/*     */     //   103: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #451	-> 0
/*     */     //   #452	-> 10
/*     */     //   #453	-> 48
/*     */     //   #454	-> 51
/*     */     //   #456	-> 67
/*     */     //   #457	-> 93
/*     */     //   #451	-> 97
/*     */     //   #461	-> 103
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   5	98	2	i	I
/*     */     //   0	104	0	this	Lkotlinx/serialization/cbor/internal/CborParser;
/*     */     //   0	104	1	lengthStack	Ljava/util/List;
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
/*     */   private final boolean isIndefinite() {
/* 470 */     int majorType = this.curByte & 0xE0;
/* 471 */     int value = this.curByte & 0x1F;
/*     */     
/* 473 */     return (value == 31 && (
/* 474 */       majorType == 128 || majorType == 160 || 
/* 475 */       majorType == 64 || majorType == 96));
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
/*     */   private final int elementLength() {
/* 492 */     int majorType = this.curByte & 0xE0;
/* 493 */     int additionalInformation = this.curByte & 0x1F;
/*     */     
/* 495 */     switch (majorType) { case 64: case 96: case 128:
/*     */       
/*     */       case 160:
/* 498 */        }  switch (additionalInformation) { case 24: 
/*     */       case 25: 
/*     */       case 26:
/*     */       
/*     */       case 27:
/* 503 */        }  return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final byte[] readIndefiniteLengthBytes() {
/* 514 */     List<byte[]> byteStrings = new ArrayList();
/*     */     while (true) {
/* 516 */       byteStrings.add(readBytes());
/* 517 */       readByte();
/* 518 */       if (isEnd())
/* 519 */         return DecoderKt.access$flatten(byteStrings); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\internal\CborParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */