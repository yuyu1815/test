/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonEncoder;
/*     */ import kotlinx.serialization.modules.SerializersModule;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000¼\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\005\n\000\n\002\020\n\n\002\b\002\n\002\020\t\n\000\n\002\020\007\n\000\n\002\020\006\n\000\n\002\020\f\n\002\b\004\b\000\030\0002\0020\0012\0020\002B1\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\020\020\t\032\f\022\006\022\004\030\0010\001\030\0010\n¢\006\004\b\013\020\fB1\b\020\022\006\020\r\032\0020\016\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\016\020\t\032\n\022\006\022\004\030\0010\0010\n¢\006\004\b\013\020\017J\020\020\036\032\0020\0372\006\020 \032\0020!H\026J\030\020\"\032\0020\0322\006\020#\032\0020$2\006\020%\032\0020&H\026J)\020'\032\0020\037\"\004\b\000\020(2\f\020)\032\b\022\004\022\002H(0*2\006\020+\032\002H(H\026¢\006\002\020,J\030\020-\032\0020\0372\006\020.\032\0020\0342\006\020/\032\0020\034H\002J\020\0200\032\002012\006\020#\032\0020$H\026J\020\0202\032\0020\0372\006\020#\032\0020$H\026J\030\0203\032\0020\0322\006\020#\032\0020$2\006\020%\032\0020&H\026J?\0204\032\0020\037\"\b\b\000\020(*\002052\006\020#\032\0020$2\006\020%\032\0020&2\f\020)\032\b\022\004\022\002H(0*2\b\020+\032\004\030\001H(H\026¢\006\002\0206J\020\0207\032\002082\006\020#\032\0020$H\026JR\0209\032\002H(\"\n\b\000\020(\030\001*\0020\00426\020:\0322\022\023\022\0210\016¢\006\f\b<\022\b\b=\022\004\b\b(>\022\023\022\0210\032¢\006\f\b<\022\b\b=\022\004\b\b(\031\022\004\022\002H(0;H\b¢\006\002\020?J\b\020@\032\0020\037H\026J\020\020A\032\0020\0372\006\020+\032\0020\032H\026J\020\020B\032\0020\0372\006\020+\032\0020CH\026J\020\020D\032\0020\0372\006\020+\032\0020EH\026J\020\020F\032\0020\0372\006\020+\032\0020&H\026J\020\020G\032\0020\0372\006\020+\032\0020HH\026J\020\020I\032\0020\0372\006\020+\032\0020JH\026J\020\020K\032\0020\0372\006\020+\032\0020LH\026J\020\020M\032\0020\0372\006\020+\032\0020NH\026J\020\020O\032\0020\0372\006\020+\032\0020\034H\026J\030\020P\032\0020\0372\006\020Q\032\0020$2\006\020%\032\0020&H\026R\016\020\003\032\0020\004X\004¢\006\002\n\000R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\020\020\021R\016\020\007\032\0020\bX\004¢\006\002\n\000R\032\020\t\032\f\022\006\022\004\030\0010\001\030\0010\nX\004¢\006\004\n\002\020\022R\024\020\023\032\0020\024X\004¢\006\b\n\000\032\004\b\025\020\026R\016\020\027\032\0020\030X\004¢\006\002\n\000R\016\020\031\032\0020\032X\016¢\006\002\n\000R\020\020\033\032\004\030\0010\034X\016¢\006\002\n\000R\020\020\035\032\004\030\0010\034X\016¢\006\002\n\000¨\006R"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "composer", "Lkotlinx/serialization/json/internal/Composer;", "json", "Lkotlinx/serialization/json/Json;", "mode", "Lkotlinx/serialization/json/internal/WriteMode;", "modeReuseCache", "", "<init>", "(Lkotlinx/serialization/json/internal/Composer;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "output", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "getJson", "()Lkotlinx/serialization/json/Json;", "[Lkotlinx/serialization/json/JsonEncoder;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "forceQuoting", "", "polymorphicDiscriminator", "", "polymorphicSerialName", "encodeJsonElement", "", "element", "Lkotlinx/serialization/json/JsonElement;", "shouldEncodeElementDefault", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "index", "", "encodeSerializableValue", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeTypeInfo", "discriminator", "serialName", "beginStructure", "Lkotlinx/serialization/encoding/CompositeEncoder;", "endStructure", "encodeElement", "encodeNullableSerializableElement", "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeInline", "Lkotlinx/serialization/encoding/Encoder;", "composerAs", "composerCreator", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "writer", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/serialization/json/internal/Composer;", "encodeNull", "encodeBoolean", "encodeByte", "", "encodeShort", "", "encodeInt", "encodeLong", "", "encodeFloat", "", "encodeDouble", "", "encodeChar", "", "encodeString", "encodeEnum", "enumDescriptor", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nStreamingJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n178#1,2:261\n178#1,2:263\n21#2,12:233\n35#2,15:246\n1#3:245\n1#3:265\n*S KotlinDebug\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n*L\n168#1:261,2\n169#1:263,2\n68#1:233,12\n68#1:246,15\n68#1:245\n*E\n"})
/*     */ public final class StreamingJsonEncoder extends AbstractEncoder implements JsonEncoder {
/*     */   @NotNull
/*     */   private final Composer composer;
/*     */   @NotNull
/*     */   private final Json json;
/*     */   @NotNull
/*     */   private final WriteMode mode;
/*     */   @Nullable
/*     */   private final JsonEncoder[] modeReuseCache;
/*     */   
/*     */   @NotNull
/*  30 */   public Json getJson() { return this.json; } @NotNull private final SerializersModule serializersModule; @NotNull private final JsonConfiguration configuration; private boolean forceQuoting; @Nullable private String polymorphicDiscriminator; @Nullable private String polymorphicSerialName; public StreamingJsonEncoder(@NotNull Composer composer, @NotNull Json json, @NotNull WriteMode mode, @Nullable JsonEncoder[] modeReuseCache) { this.composer = composer; this.json = json;
/*  31 */     this.mode = mode;
/*  32 */     this.modeReuseCache = modeReuseCache;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  40 */     this.serializersModule = getJson().getSerializersModule();
/*  41 */     this.configuration = getJson().getConfiguration();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  49 */     int i = this.mode.ordinal();
/*  50 */     if (this.modeReuseCache != null && (
/*  51 */       this.modeReuseCache[i] != null || this.modeReuseCache[i] != this))
/*  52 */       this.modeReuseCache[i] = this;  } public StreamingJsonEncoder(@NotNull InternalJsonWriter output, @NotNull Json json, @NotNull WriteMode mode, @NotNull JsonEncoder[] modeReuseCache) { this(ComposersKt.Composer(output, json), json, mode, modeReuseCache); } @NotNull
/*     */   public SerializersModule getSerializersModule() {
/*     */     return this.serializersModule;
/*     */   }
/*     */   public void encodeJsonElement(@NotNull JsonElement element) {
/*  57 */     Intrinsics.checkNotNullParameter(element, "element"); if (this.polymorphicDiscriminator != null && !(element instanceof kotlinx.serialization.json.JsonObject)) {
/*  58 */       PolymorphicKt.throwJsonElementPolymorphicException(this.polymorphicSerialName, element); throw new KotlinNothingValueException();
/*     */     } 
/*  60 */     encodeSerializableValue((SerializationStrategy<? super JsonElement>)JsonElementSerializer.INSTANCE, element);
/*     */   }
/*     */   
/*     */   public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int index) {
/*  64 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); return this.configuration.getEncodeDefaults();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> void encodeSerializableValue(@NotNull SerializationStrategy serializer, Object value) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'serializer'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: checkcast kotlinx/serialization/json/JsonEncoder
/*     */     //   10: astore_3
/*     */     //   11: iconst_0
/*     */     //   12: istore #4
/*     */     //   14: aload_3
/*     */     //   15: invokeinterface getJson : ()Lkotlinx/serialization/json/Json;
/*     */     //   20: invokevirtual getConfiguration : ()Lkotlinx/serialization/json/JsonConfiguration;
/*     */     //   23: invokevirtual getUseArrayPolymorphism : ()Z
/*     */     //   26: ifeq -> 43
/*     */     //   29: aload_1
/*     */     //   30: aload_3
/*     */     //   31: checkcast kotlinx/serialization/encoding/Encoder
/*     */     //   34: aload_2
/*     */     //   35: invokeinterface serialize : (Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
/*     */     //   40: goto -> 388
/*     */     //   43: aload_1
/*     */     //   44: instanceof kotlinx/serialization/internal/AbstractPolymorphicSerializer
/*     */     //   47: istore #5
/*     */     //   49: iload #5
/*     */     //   51: ifeq -> 80
/*     */     //   54: aload_3
/*     */     //   55: invokeinterface getJson : ()Lkotlinx/serialization/json/Json;
/*     */     //   60: invokevirtual getConfiguration : ()Lkotlinx/serialization/json/JsonConfiguration;
/*     */     //   63: invokevirtual getClassDiscriminatorMode : ()Lkotlinx/serialization/json/ClassDiscriminatorMode;
/*     */     //   66: getstatic kotlinx/serialization/json/ClassDiscriminatorMode.NONE : Lkotlinx/serialization/json/ClassDiscriminatorMode;
/*     */     //   69: if_acmpeq -> 76
/*     */     //   72: iconst_1
/*     */     //   73: goto -> 186
/*     */     //   76: iconst_0
/*     */     //   77: goto -> 186
/*     */     //   80: aload_3
/*     */     //   81: invokeinterface getJson : ()Lkotlinx/serialization/json/Json;
/*     */     //   86: invokevirtual getConfiguration : ()Lkotlinx/serialization/json/JsonConfiguration;
/*     */     //   89: invokevirtual getClassDiscriminatorMode : ()Lkotlinx/serialization/json/ClassDiscriminatorMode;
/*     */     //   92: getstatic kotlinx/serialization/json/internal/PolymorphicKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   95: swap
/*     */     //   96: invokevirtual ordinal : ()I
/*     */     //   99: iaload
/*     */     //   100: tableswitch default -> 178, 1 -> 128, 2 -> 128, 3 -> 132
/*     */     //   128: iconst_0
/*     */     //   129: goto -> 186
/*     */     //   132: aload_1
/*     */     //   133: invokeinterface getDescriptor : ()Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   138: invokeinterface getKind : ()Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   143: astore #6
/*     */     //   145: iconst_0
/*     */     //   146: istore #7
/*     */     //   148: aload #6
/*     */     //   150: getstatic kotlinx/serialization/descriptors/StructureKind$CLASS.INSTANCE : Lkotlinx/serialization/descriptors/StructureKind$CLASS;
/*     */     //   153: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   156: ifne -> 170
/*     */     //   159: aload #6
/*     */     //   161: getstatic kotlinx/serialization/descriptors/StructureKind$OBJECT.INSTANCE : Lkotlinx/serialization/descriptors/StructureKind$OBJECT;
/*     */     //   164: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   167: ifeq -> 174
/*     */     //   170: iconst_1
/*     */     //   171: goto -> 175
/*     */     //   174: iconst_0
/*     */     //   175: goto -> 186
/*     */     //   178: new kotlin/NoWhenBranchMatchedException
/*     */     //   181: dup
/*     */     //   182: invokespecial <init> : ()V
/*     */     //   185: athrow
/*     */     //   186: istore #8
/*     */     //   188: iload #8
/*     */     //   190: ifeq -> 211
/*     */     //   193: aload_1
/*     */     //   194: invokeinterface getDescriptor : ()Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   199: aload_3
/*     */     //   200: invokeinterface getJson : ()Lkotlinx/serialization/json/Json;
/*     */     //   205: invokestatic classDiscriminator : (Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Ljava/lang/String;
/*     */     //   208: goto -> 212
/*     */     //   211: aconst_null
/*     */     //   212: astore #9
/*     */     //   214: iload #5
/*     */     //   216: ifeq -> 332
/*     */     //   219: aload_1
/*     */     //   220: checkcast kotlinx/serialization/internal/AbstractPolymorphicSerializer
/*     */     //   223: astore #10
/*     */     //   225: aload_2
/*     */     //   226: dup
/*     */     //   227: ifnonnull -> 279
/*     */     //   230: pop
/*     */     //   231: iconst_0
/*     */     //   232: istore #6
/*     */     //   234: new java/lang/StringBuilder
/*     */     //   237: dup
/*     */     //   238: invokespecial <init> : ()V
/*     */     //   241: ldc 'Value for serializer '
/*     */     //   243: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   246: aload_1
/*     */     //   247: checkcast kotlinx/serialization/internal/AbstractPolymorphicSerializer
/*     */     //   250: invokevirtual getDescriptor : ()Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   253: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   256: ldc ' should always be non-null. Please report issue to the kotlinx.serialization tracker.'
/*     */     //   258: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   261: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   264: astore #6
/*     */     //   266: new java/lang/IllegalArgumentException
/*     */     //   269: dup
/*     */     //   270: aload #6
/*     */     //   272: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   275: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   278: athrow
/*     */     //   279: pop
/*     */     //   280: aload #10
/*     */     //   282: aload_3
/*     */     //   283: checkcast kotlinx/serialization/encoding/Encoder
/*     */     //   286: aload_2
/*     */     //   287: invokestatic findPolymorphicSerializer : (Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;
/*     */     //   290: astore #6
/*     */     //   292: aload #9
/*     */     //   294: ifnull -> 320
/*     */     //   297: aload_1
/*     */     //   298: aload #6
/*     */     //   300: aload #9
/*     */     //   302: invokestatic access$validateIfSealed : (Lkotlinx/serialization/SerializationStrategy;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/String;)V
/*     */     //   305: aload #6
/*     */     //   307: invokeinterface getDescriptor : ()Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   312: invokeinterface getKind : ()Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   317: invokestatic checkKind : (Lkotlinx/serialization/descriptors/SerialKind;)V
/*     */     //   320: aload #6
/*     */     //   322: ldc 'null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>'
/*     */     //   324: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   327: aload #6
/*     */     //   329: goto -> 333
/*     */     //   332: aload_1
/*     */     //   333: astore #11
/*     */     //   335: aload #9
/*     */     //   337: ifnull -> 375
/*     */     //   340: aload #9
/*     */     //   342: aload #11
/*     */     //   344: invokeinterface getDescriptor : ()Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   349: invokeinterface getSerialName : ()Ljava/lang/String;
/*     */     //   354: astore #12
/*     */     //   356: astore #13
/*     */     //   358: iconst_0
/*     */     //   359: istore #14
/*     */     //   361: aload_0
/*     */     //   362: aload #13
/*     */     //   364: putfield polymorphicDiscriminator : Ljava/lang/String;
/*     */     //   367: aload_0
/*     */     //   368: aload #12
/*     */     //   370: putfield polymorphicSerialName : Ljava/lang/String;
/*     */     //   373: nop
/*     */     //   374: nop
/*     */     //   375: aload #11
/*     */     //   377: aload_3
/*     */     //   378: checkcast kotlinx/serialization/encoding/Encoder
/*     */     //   381: aload_2
/*     */     //   382: invokeinterface serialize : (Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
/*     */     //   387: nop
/*     */     //   388: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #68	-> 6
/*     */     //   #233	-> 14
/*     */     //   #234	-> 29
/*     */     //   #235	-> 40
/*     */     //   #237	-> 43
/*     */     //   #239	-> 49
/*     */     //   #240	-> 54
/*     */     //   #242	-> 80
/*     */     //   #243	-> 128
/*     */     //   #244	-> 132
/*     */     //   #245	-> 145
/*     */     //   #244	-> 148
/*     */     //   #244	-> 175
/*     */     //   #242	-> 178
/*     */     //   #239	-> 186
/*     */     //   #238	-> 186
/*     */     //   #246	-> 188
/*     */     //   #247	-> 214
/*     */     //   #248	-> 219
/*     */     //   #249	-> 225
/*     */     //   #245	-> 231
/*     */     //   #249	-> 234
/*     */     //   #249	-> 264
/*     */     //   #250	-> 280
/*     */     //   #251	-> 292
/*     */     //   #252	-> 297
/*     */     //   #253	-> 305
/*     */     //   #255	-> 320
/*     */     //   #256	-> 332
/*     */     //   #247	-> 333
/*     */     //   #258	-> 335
/*     */     //   #69	-> 361
/*     */     //   #70	-> 367
/*     */     //   #71	-> 373
/*     */     //   #258	-> 374
/*     */     //   #259	-> 375
/*     */     //   #260	-> 387
/*     */     //   #72	-> 388
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   361	13	14	$i$a$-encodePolymorphically-StreamingJsonEncoder$encodeSerializableValue$1	I
/*     */     //   358	16	13	discriminatorName	Ljava/lang/String;
/*     */     //   358	16	12	serialName	Ljava/lang/String;
/*     */     //   148	27	7	$i$a$-let-PolymorphicKt$encodePolymorphically$needDiscriminator$1$iv	I
/*     */     //   145	30	6	it$iv	Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   234	30	6	$i$a$-requireNotNull-PolymorphicKt$encodePolymorphically$actualSerializer$1$iv	I
/*     */     //   225	104	10	casted$iv	Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;
/*     */     //   292	37	6	actual$iv	Lkotlinx/serialization/SerializationStrategy;
/*     */     //   14	374	4	$i$f$encodePolymorphically	I
/*     */     //   49	339	5	isPolymorphicSerializer$iv	Z
/*     */     //   188	200	8	needDiscriminator$iv	Z
/*     */     //   214	174	9	baseClassDiscriminator$iv	Ljava/lang/String;
/*     */     //   335	53	11	actualSerializer$iv	Lkotlinx/serialization/SerializationStrategy;
/*     */     //   11	377	3	$this$encodePolymorphically$iv	Lkotlinx/serialization/json/JsonEncoder;
/*     */     //   0	389	0	this	Lkotlinx/serialization/json/internal/StreamingJsonEncoder;
/*     */     //   0	389	1	serializer	Lkotlinx/serialization/SerializationStrategy;
/*     */     //   0	389	2	value	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */   
/*     */   private final void encodeTypeInfo(String discriminator, String serialName) {
/*  75 */     this.composer.nextItem();
/*  76 */     encodeString(discriminator);
/*  77 */     this.composer.print(':');
/*  78 */     this.composer.space();
/*  79 */     encodeString(serialName);
/*     */   }
/*     */   @NotNull
/*     */   public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor) {
/*  83 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); WriteMode newMode = WriteModeKt.switchMode(getJson(), descriptor);
/*  84 */     if (newMode.begin != '\000') {
/*  85 */       this.composer.print(newMode.begin);
/*  86 */       this.composer.indent();
/*     */     } 
/*     */     
/*  89 */     String discriminator = this.polymorphicDiscriminator;
/*  90 */     if (discriminator != null) {
/*  91 */       if (this.polymorphicSerialName == null); discriminator.encodeTypeInfo(this.polymorphicSerialName, descriptor.getSerialName());
/*  92 */       this.polymorphicDiscriminator = null;
/*  93 */       this.polymorphicSerialName = null;
/*     */     } 
/*     */     
/*  96 */     if (this.mode == newMode) {
/*  97 */       return (CompositeEncoder)this;
/*     */     }
/*     */     
/* 100 */     this.modeReuseCache[newMode.ordinal()]; return (this.modeReuseCache != null && this.modeReuseCache[newMode.ordinal()] != null) ? (CompositeEncoder)this.modeReuseCache[newMode.ordinal()] : (CompositeEncoder)new StreamingJsonEncoder(this.composer, getJson(), newMode, this.modeReuseCache);
/*     */   }
/*     */   
/*     */   public void endStructure(@NotNull SerialDescriptor descriptor) {
/* 104 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); if (this.mode.end != '\000') {
/* 105 */       this.composer.unIndent();
/* 106 */       this.composer.nextItemIfNotFirst();
/* 107 */       this.composer.print(this.mode.end);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean encodeElement(@NotNull SerialDescriptor descriptor, int index) {
/* 112 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); switch (WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()])
/*     */     { case 1:
/* 114 */         if (!this.composer.getWritingFirst())
/* 115 */           this.composer.print(','); 
/* 116 */         this.composer.nextItem();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 152 */         return true;case 2: if (!this.composer.getWritingFirst()) { this.composer.print(','); this.composer.nextItem(); this.composer.print(':'); this.composer.space(); this.forceQuoting = (index % 2 == 0); } else { this.forceQuoting = true; this.composer.nextItem(); }  return true;case 3: if (index == 0) this.forceQuoting = true;  if (index == 1) { this.composer.print(','); this.composer.space(); this.forceQuoting = false; }  return true; }  if (!this.composer.getWritingFirst()) this.composer.print(',');  this.composer.nextItem(); encodeString(JsonNamesMapKt.getJsonElementName(descriptor, getJson(), index)); this.composer.print(':'); this.composer.space(); return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull SerializationStrategy serializer, @Nullable Object value) {
/* 161 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); Intrinsics.checkNotNullParameter(serializer, "serializer"); if (value != null || this.configuration.getExplicitNulls()) super
/* 162 */         .encodeNullableSerializableElement(descriptor, index, serializer, value); 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
/* 167 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/* 168 */     StreamingJsonEncoder this_$iv = this; int $i$f$composerAs = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 261 */     if (this_$iv.composer instanceof ComposerForUnsignedNumbers) {  }
/* 262 */     else { boolean bool = this_$iv.forceQuoting; InternalJsonWriter p0 = this_$iv.composer.writer; int $i$a$-composerAs-StreamingJsonEncoder$encodeInline$1 = 0; }
/* 263 */      JsonEncoder[] arrayOfJsonEncoder1 = null; WriteMode writeMode1 = this.mode; Json json1 = getJson(); ComposerForUnsignedNumbers composerForUnsignedNumbers = new ComposerForUnsignedNumbers(p0, bool); this_$iv = this; $i$f$composerAs = 0; if (this_$iv.composer instanceof ComposerForUnquotedLiterals) {  }
/* 264 */     else { boolean p1 = this_$iv.forceQuoting; InternalJsonWriter p0 = this_$iv.composer.writer; int $i$a$-composerAs-StreamingJsonEncoder$encodeInline$2 = 0; }
/* 265 */      JsonEncoder[] arrayOfJsonEncoder2 = null; WriteMode writeMode2 = this.mode; Json json2 = getJson(); ComposerForUnquotedLiterals composerForUnquotedLiterals = new ComposerForUnquotedLiterals(p0, p1); StreamingJsonEncoder $this$encodeInline_u24lambda_u242 = this_$iv = this; int $i$a$-apply-StreamingJsonEncoder$encodeInline$3 = 0;
/*     */     $this$encodeInline_u24lambda_u242.polymorphicSerialName = descriptor.getSerialName();
/*     */     return StreamingJsonEncoderKt.isUnsignedNumber(descriptor) ? (Encoder)new StreamingJsonEncoder(composerForUnsignedNumbers, json1, writeMode1, arrayOfJsonEncoder1) : (StreamingJsonEncoderKt.isUnquotedLiteral(descriptor) ? (Encoder)new StreamingJsonEncoder(composerForUnquotedLiterals, json2, writeMode2, arrayOfJsonEncoder2) : ((this.polymorphicDiscriminator != null) ? (Encoder)this_$iv : super.encodeInline(descriptor)));
/*     */   }
/*     */   
/*     */   public void encodeNull() {
/*     */     this.composer.print("null");
/*     */   }
/*     */   
/*     */   public void encodeBoolean(boolean value) {
/*     */     if (this.forceQuoting) {
/*     */       encodeString(String.valueOf(value));
/*     */     } else {
/*     */       this.composer.print(value);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void encodeByte(byte value) {
/*     */     if (this.forceQuoting) {
/*     */       encodeString(String.valueOf(value));
/*     */     } else {
/*     */       this.composer.print(value);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void encodeShort(short value) {
/*     */     if (this.forceQuoting) {
/*     */       encodeString(String.valueOf(value));
/*     */     } else {
/*     */       this.composer.print(value);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void encodeInt(int value) {
/*     */     if (this.forceQuoting) {
/*     */       encodeString(String.valueOf(value));
/*     */     } else {
/*     */       this.composer.print(value);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void encodeLong(long value) {
/*     */     if (this.forceQuoting) {
/*     */       encodeString(String.valueOf(value));
/*     */     } else {
/*     */       this.composer.print(value);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void encodeFloat(float value) {
/*     */     if (this.forceQuoting) {
/*     */       encodeString(String.valueOf(value));
/*     */     } else {
/*     */       this.composer.print(value);
/*     */     } 
/*     */     if (!this.configuration.getAllowSpecialFloatingPointValues()) {
/*     */       float f = value;
/*     */       if (!((!Float.isInfinite(f) && !Float.isNaN(f)) ? 1 : 0))
/*     */         throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(value), this.composer.writer.toString()); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void encodeDouble(double value) {
/*     */     if (this.forceQuoting) {
/*     */       encodeString(String.valueOf(value));
/*     */     } else {
/*     */       this.composer.print(value);
/*     */     } 
/*     */     if (!this.configuration.getAllowSpecialFloatingPointValues()) {
/*     */       double d = value;
/*     */       if (!((!Double.isInfinite(d) && !Double.isNaN(d)) ? 1 : 0))
/*     */         throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(value), this.composer.writer.toString()); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void encodeChar(char value) {
/*     */     encodeString(String.valueOf(value));
/*     */   }
/*     */   
/*     */   public void encodeString(@NotNull String value) {
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     this.composer.printQuoted(value);
/*     */   }
/*     */   
/*     */   public void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int index) {
/*     */     Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
/*     */     encodeString(enumDescriptor.getElementName(index));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\StreamingJsonEncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */