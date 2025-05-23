/*     */ package kotlinx.serialization.cbor.internal;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.cbor.ObjectTags;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000<\n\000\n\002\020\b\n\002\b\r\n\002\020\005\n\002\b\n\n\002\020\007\n\000\n\002\020\013\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\t\n\002\b\004\n\002\020\033\n\002\b\005\032\024\020\033\032\0020\034*\0020\0352\006\020\036\032\0020\001H\000\032\f\020\037\032\0020\034*\0020\035H\000\032\033\020 \032\004\030\0010!*\0020\0352\006\020\036\032\0020\001H\000¢\006\002\020\"\032\033\020#\032\004\030\0010!*\0020\0352\006\020\036\032\0020\001H\000¢\006\002\020\"\032\033\020$\032\004\030\0010%*\0020\0352\006\020\036\032\0020\001H\000¢\006\002\020&\032\f\020'\032\0020\034*\0020\035H\000\032(\020(\032\004\030\001H)\"\n\b\000\020)\030\001*\0020**\0020\0352\006\020+\032\0020\001H\b¢\006\002\020,\032\023\020-\032\004\030\0010!*\0020\035H\000¢\006\002\020.\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\016\020\005\032\0020\001XT¢\006\002\n\000\"\016\020\006\032\0020\001XT¢\006\002\n\000\"\016\020\007\032\0020\001XT¢\006\002\n\000\"\016\020\b\032\0020\001XT¢\006\002\n\000\"\016\020\t\032\0020\001XT¢\006\002\n\000\"\016\020\n\032\0020\001XT¢\006\002\n\000\"\016\020\013\032\0020\001XT¢\006\002\n\000\"\016\020\f\032\0020\001XT¢\006\002\n\000\"\016\020\r\032\0020\001XT¢\006\002\n\000\"\016\020\016\032\0020\017XT¢\006\002\n\000\"\016\020\020\032\0020\001XT¢\006\002\n\000\"\016\020\021\032\0020\001XT¢\006\002\n\000\"\016\020\022\032\0020\001XT¢\006\002\n\000\"\016\020\023\032\0020\001XT¢\006\002\n\000\"\016\020\024\032\0020\001XT¢\006\002\n\000\"\016\020\025\032\0020\001XT¢\006\002\n\000\"\016\020\026\032\0020\001XT¢\006\002\n\000\"\016\020\027\032\0020\001XT¢\006\002\n\000\"\016\020\030\032\0020\001XT¢\006\002\n\000\"\016\020\031\032\0020\032XT¢\006\002\n\000¨\006/"}, d2 = {"FALSE", "", "TRUE", "NULL", "EMPTY_MAP", "NEXT_HALF", "NEXT_FLOAT", "NEXT_DOUBLE", "BEGIN_ARRAY", "BEGIN_MAP", "BREAK", "ADDITIONAL_INFORMATION_INDEFINITE_LENGTH", "HEADER_BYTE_STRING", "HEADER_STRING", "HEADER_NEGATIVE", "", "HEADER_ARRAY", "HEADER_MAP", "HEADER_TAG", "LENGTH_STACK_INDEFINITE", "HALF_PRECISION_EXPONENT_BIAS", "HALF_PRECISION_MAX_EXPONENT", "HALF_PRECISION_MAX_MANTISSA", "SINGLE_PRECISION_EXPONENT_BIAS", "SINGLE_PRECISION_MAX_EXPONENT", "SINGLE_PRECISION_NORMALIZE_BASE", "", "isByteString", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "index", "isInlineByteString", "getValueTags", "Lkotlin/ULongArray;", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)[J", "getKeyTags", "getCborLabel", "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Long;", "hasArrayTag", "findAnnotation", "A", "", "elementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/annotation/Annotation;", "getObjectTags", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)[J", "kotlinx-serialization-cbor"})
/*     */ @SourceDebugExtension({"SMAP\nEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Encoding.kt\nkotlinx/serialization/cbor/internal/EncodingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n74#1:82\n74#1:85\n74#1:88\n1#2:81\n295#3,2:83\n295#3,2:86\n295#3,2:89\n1755#3,3:91\n295#3,2:94\n808#3,11:96\n*S KotlinDebug\n*F\n+ 1 Encoding.kt\nkotlinx/serialization/cbor/internal/EncodingKt\n*L\n59#1:82\n62#1:85\n65#1:88\n59#1:83,2\n62#1:86,2\n65#1:89,2\n69#1:91,3\n74#1:94,2\n79#1:96,11\n*E\n"})
/*     */ public final class EncodingKt
/*     */ {
/*     */   public static final int FALSE = 244;
/*     */   public static final int TRUE = 245;
/*     */   public static final int NULL = 246;
/*     */   public static final int EMPTY_MAP = 160;
/*     */   public static final int NEXT_HALF = 249;
/*     */   public static final int NEXT_FLOAT = 250;
/*     */   public static final int NEXT_DOUBLE = 251;
/*     */   public static final int BEGIN_ARRAY = 159;
/*     */   public static final int BEGIN_MAP = 191;
/*     */   public static final int BREAK = 255;
/*     */   public static final int ADDITIONAL_INFORMATION_INDEFINITE_LENGTH = 31;
/*     */   public static final int HEADER_BYTE_STRING = 64;
/*     */   public static final int HEADER_STRING = 96;
/*     */   public static final byte HEADER_NEGATIVE = 32;
/*     */   public static final int HEADER_ARRAY = 128;
/*     */   public static final int HEADER_MAP = 160;
/*     */   public static final int HEADER_TAG = 192;
/*     */   public static final int LENGTH_STACK_INDEFINITE = -1;
/*     */   public static final int HALF_PRECISION_EXPONENT_BIAS = 15;
/*     */   public static final int HALF_PRECISION_MAX_EXPONENT = 31;
/*     */   public static final int HALF_PRECISION_MAX_MANTISSA = 1023;
/*     */   public static final int SINGLE_PRECISION_EXPONENT_BIAS = 127;
/*     */   public static final int SINGLE_PRECISION_MAX_EXPONENT = 255;
/*     */   public static final float SINGLE_PRECISION_NORMALIZE_BASE = 0.5F;
/*     */   
/*     */   public static final boolean isByteString(@NotNull SerialDescriptor $this$isByteString, int index) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: iload_1
/*     */     //   8: invokeinterface getElementAnnotations : (I)Ljava/util/List;
/*     */     //   13: checkcast java/lang/Iterable
/*     */     //   16: astore_2
/*     */     //   17: aload_2
/*     */     //   18: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   23: astore_3
/*     */     //   24: aload_3
/*     */     //   25: invokeinterface hasNext : ()Z
/*     */     //   30: ifeq -> 64
/*     */     //   33: aload_3
/*     */     //   34: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   39: astore #4
/*     */     //   41: aload #4
/*     */     //   43: checkcast java/lang/annotation/Annotation
/*     */     //   46: astore #5
/*     */     //   48: iconst_0
/*     */     //   49: istore #6
/*     */     //   51: aload #5
/*     */     //   53: instanceof kotlinx/serialization/cbor/ByteString
/*     */     //   56: ifeq -> 24
/*     */     //   59: aload #4
/*     */     //   61: goto -> 65
/*     */     //   64: aconst_null
/*     */     //   65: ifnull -> 72
/*     */     //   68: iconst_1
/*     */     //   69: goto -> 73
/*     */     //   72: iconst_0
/*     */     //   73: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #49	-> 6
/*     */     //   #81	-> 48
/*     */     //   #49	-> 51
/*     */     //   #49	-> 56
/*     */     //   #49	-> 65
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   51	5	6	$i$a$-find-EncodingKt$isByteString$1	I
/*     */     //   48	8	5	it	Ljava/lang/annotation/Annotation;
/*     */     //   0	74	0	$this$isByteString	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   0	74	1	index	I
/*     */   }
/*     */   
/*     */   public static final boolean isInlineByteString(@NotNull SerialDescriptor $this$isInlineByteString) {
/*  55 */     Intrinsics.checkNotNullParameter($this$isInlineByteString, "<this>"); return ($this$isInlineByteString.isInline() && isByteString($this$isInlineByteString, 0));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final long[] getValueTags(@NotNull SerialDescriptor $this$getValueTags, int index) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: astore_2
/*     */     //   8: iconst_0
/*     */     //   9: istore_3
/*     */     //   10: aload_2
/*     */     //   11: iload_1
/*     */     //   12: invokeinterface getElementAnnotations : (I)Ljava/util/List;
/*     */     //   17: checkcast java/lang/Iterable
/*     */     //   20: astore #4
/*     */     //   22: iconst_0
/*     */     //   23: istore #5
/*     */     //   25: aload #4
/*     */     //   27: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   32: astore #6
/*     */     //   34: aload #6
/*     */     //   36: invokeinterface hasNext : ()Z
/*     */     //   41: ifeq -> 76
/*     */     //   44: aload #6
/*     */     //   46: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   51: astore #7
/*     */     //   53: aload #7
/*     */     //   55: checkcast java/lang/annotation/Annotation
/*     */     //   58: astore #8
/*     */     //   60: iconst_0
/*     */     //   61: istore #9
/*     */     //   63: aload #8
/*     */     //   65: instanceof kotlinx/serialization/cbor/ValueTags
/*     */     //   68: ifeq -> 34
/*     */     //   71: aload #7
/*     */     //   73: goto -> 77
/*     */     //   76: aconst_null
/*     */     //   77: checkcast kotlinx/serialization/cbor/ValueTags
/*     */     //   80: checkcast java/lang/annotation/Annotation
/*     */     //   83: nop
/*     */     //   84: checkcast kotlinx/serialization/cbor/ValueTags
/*     */     //   87: dup
/*     */     //   88: ifnull -> 99
/*     */     //   91: invokeinterface tags : ()[J
/*     */     //   96: goto -> 101
/*     */     //   99: pop
/*     */     //   100: aconst_null
/*     */     //   101: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #59	-> 6
/*     */     //   #82	-> 10
/*     */     //   #83	-> 25
/*     */     //   #82	-> 63
/*     */     //   #83	-> 68
/*     */     //   #84	-> 76
/*     */     //   #82	-> 83
/*     */     //   #59	-> 84
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   63	5	9	$i$a$-firstOrNull-EncodingKt$findAnnotation$1$iv	I
/*     */     //   60	8	8	it$iv	Ljava/lang/annotation/Annotation;
/*     */     //   53	23	7	element$iv$iv	Ljava/lang/Object;
/*     */     //   25	52	5	$i$f$firstOrNull	I
/*     */     //   22	55	4	$this$firstOrNull$iv$iv	Ljava/lang/Iterable;
/*     */     //   10	74	3	$i$f$findAnnotation	I
/*     */     //   8	76	2	$this$findAnnotation$iv	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   0	102	0	$this$getValueTags	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   0	102	1	index	I
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final long[] getKeyTags(@NotNull SerialDescriptor $this$getKeyTags, int index) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: astore_2
/*     */     //   8: iconst_0
/*     */     //   9: istore_3
/*     */     //   10: aload_2
/*     */     //   11: iload_1
/*     */     //   12: invokeinterface getElementAnnotations : (I)Ljava/util/List;
/*     */     //   17: checkcast java/lang/Iterable
/*     */     //   20: astore #4
/*     */     //   22: iconst_0
/*     */     //   23: istore #5
/*     */     //   25: aload #4
/*     */     //   27: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   32: astore #6
/*     */     //   34: aload #6
/*     */     //   36: invokeinterface hasNext : ()Z
/*     */     //   41: ifeq -> 76
/*     */     //   44: aload #6
/*     */     //   46: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   51: astore #7
/*     */     //   53: aload #7
/*     */     //   55: checkcast java/lang/annotation/Annotation
/*     */     //   58: astore #8
/*     */     //   60: iconst_0
/*     */     //   61: istore #9
/*     */     //   63: aload #8
/*     */     //   65: instanceof kotlinx/serialization/cbor/KeyTags
/*     */     //   68: ifeq -> 34
/*     */     //   71: aload #7
/*     */     //   73: goto -> 77
/*     */     //   76: aconst_null
/*     */     //   77: checkcast kotlinx/serialization/cbor/KeyTags
/*     */     //   80: checkcast java/lang/annotation/Annotation
/*     */     //   83: nop
/*     */     //   84: checkcast kotlinx/serialization/cbor/KeyTags
/*     */     //   87: dup
/*     */     //   88: ifnull -> 99
/*     */     //   91: invokeinterface tags : ()[J
/*     */     //   96: goto -> 101
/*     */     //   99: pop
/*     */     //   100: aconst_null
/*     */     //   101: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #62	-> 6
/*     */     //   #85	-> 10
/*     */     //   #86	-> 25
/*     */     //   #85	-> 63
/*     */     //   #86	-> 68
/*     */     //   #87	-> 76
/*     */     //   #85	-> 83
/*     */     //   #62	-> 84
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   63	5	9	$i$a$-firstOrNull-EncodingKt$findAnnotation$1$iv	I
/*     */     //   60	8	8	it$iv	Ljava/lang/annotation/Annotation;
/*     */     //   53	23	7	element$iv$iv	Ljava/lang/Object;
/*     */     //   25	52	5	$i$f$firstOrNull	I
/*     */     //   22	55	4	$this$firstOrNull$iv$iv	Ljava/lang/Iterable;
/*     */     //   10	74	3	$i$f$findAnnotation	I
/*     */     //   8	76	2	$this$findAnnotation$iv	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   0	102	0	$this$getKeyTags	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   0	102	1	index	I
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Long getCborLabel(@NotNull SerialDescriptor $this$getCborLabel, int index) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: astore_2
/*     */     //   8: iconst_0
/*     */     //   9: istore_3
/*     */     //   10: aload_2
/*     */     //   11: iload_1
/*     */     //   12: invokeinterface getElementAnnotations : (I)Ljava/util/List;
/*     */     //   17: checkcast java/lang/Iterable
/*     */     //   20: astore #4
/*     */     //   22: iconst_0
/*     */     //   23: istore #5
/*     */     //   25: aload #4
/*     */     //   27: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   32: astore #6
/*     */     //   34: aload #6
/*     */     //   36: invokeinterface hasNext : ()Z
/*     */     //   41: ifeq -> 76
/*     */     //   44: aload #6
/*     */     //   46: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   51: astore #7
/*     */     //   53: aload #7
/*     */     //   55: checkcast java/lang/annotation/Annotation
/*     */     //   58: astore #8
/*     */     //   60: iconst_0
/*     */     //   61: istore #9
/*     */     //   63: aload #8
/*     */     //   65: instanceof kotlinx/serialization/cbor/CborLabel
/*     */     //   68: ifeq -> 34
/*     */     //   71: aload #7
/*     */     //   73: goto -> 77
/*     */     //   76: aconst_null
/*     */     //   77: checkcast kotlinx/serialization/cbor/CborLabel
/*     */     //   80: checkcast java/lang/annotation/Annotation
/*     */     //   83: nop
/*     */     //   84: checkcast kotlinx/serialization/cbor/CborLabel
/*     */     //   87: dup
/*     */     //   88: ifnull -> 102
/*     */     //   91: invokeinterface label : ()J
/*     */     //   96: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   99: goto -> 104
/*     */     //   102: pop
/*     */     //   103: aconst_null
/*     */     //   104: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #65	-> 6
/*     */     //   #88	-> 10
/*     */     //   #89	-> 25
/*     */     //   #88	-> 63
/*     */     //   #89	-> 68
/*     */     //   #90	-> 76
/*     */     //   #88	-> 83
/*     */     //   #65	-> 84
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   63	5	9	$i$a$-firstOrNull-EncodingKt$findAnnotation$1$iv	I
/*     */     //   60	8	8	it$iv	Ljava/lang/annotation/Annotation;
/*     */     //   53	23	7	element$iv$iv	Ljava/lang/Object;
/*     */     //   25	52	5	$i$f$firstOrNull	I
/*     */     //   22	55	4	$this$firstOrNull$iv$iv	Ljava/lang/Iterable;
/*     */     //   10	74	3	$i$f$findAnnotation	I
/*     */     //   8	76	2	$this$findAnnotation$iv	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   0	105	0	$this$getCborLabel	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   0	105	1	index	I
/*     */   }
/*     */   
/*     */   public static final boolean hasArrayTag(@NotNull SerialDescriptor $this$hasArrayTag) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: invokeinterface getAnnotations : ()Ljava/util/List;
/*     */     //   12: checkcast java/lang/Iterable
/*     */     //   15: astore_1
/*     */     //   16: iconst_0
/*     */     //   17: istore_2
/*     */     //   18: aload_1
/*     */     //   19: instanceof java/util/Collection
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload_1
/*     */     //   26: checkcast java/util/Collection
/*     */     //   29: invokeinterface isEmpty : ()Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_0
/*     */     //   38: goto -> 88
/*     */     //   41: aload_1
/*     */     //   42: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   47: astore_3
/*     */     //   48: aload_3
/*     */     //   49: invokeinterface hasNext : ()Z
/*     */     //   54: ifeq -> 87
/*     */     //   57: aload_3
/*     */     //   58: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   63: astore #4
/*     */     //   65: aload #4
/*     */     //   67: checkcast java/lang/annotation/Annotation
/*     */     //   70: astore #5
/*     */     //   72: iconst_0
/*     */     //   73: istore #6
/*     */     //   75: aload #5
/*     */     //   77: instanceof kotlinx/serialization/cbor/CborArray
/*     */     //   80: ifeq -> 48
/*     */     //   83: iconst_1
/*     */     //   84: goto -> 88
/*     */     //   87: iconst_0
/*     */     //   88: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #69	-> 6
/*     */     //   #91	-> 18
/*     */     //   #92	-> 41
/*     */     //   #69	-> 75
/*     */     //   #92	-> 80
/*     */     //   #93	-> 87
/*     */     //   #69	-> 88
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   75	5	6	$i$a$-any-EncodingKt$hasArrayTag$1	I
/*     */     //   72	8	5	it	Ljava/lang/annotation/Annotation;
/*     */     //   65	22	4	element$iv	Ljava/lang/Object;
/*     */     //   18	70	2	$i$f$any	I
/*     */     //   16	72	1	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   0	89	0	$this$hasArrayTag	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final long[] getObjectTags(@NotNull SerialDescriptor $this$getObjectTags) {
/*  79 */     Intrinsics.checkNotNullParameter($this$getObjectTags, "<this>"); Iterable $this$filterIsInstance$iv = $this$getObjectTags.getAnnotations(); int $i$f$filterIsInstance = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     Iterable iterable1 = $this$filterIsInstance$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     for (Object element$iv$iv : iterable1) { if (element$iv$iv instanceof ObjectTags) destination$iv$iv.add(element$iv$iv);  }
/* 106 */      (ObjectTags)CollectionsKt.firstOrNull((List)destination$iv$iv); return ((ObjectTags)CollectionsKt.firstOrNull((List)destination$iv$iv) != null) ? ((ObjectTags)CollectionsKt.firstOrNull((List)destination$iv$iv)).tags() : null;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\internal\EncodingKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */