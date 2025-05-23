/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.descriptors.SerialKind;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonElementKt;
/*     */ import kotlinx.serialization.modules.SerializersModule;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000°\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\007\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\r\n\002\020\005\n\000\n\002\020\n\n\000\n\002\020\t\n\000\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\006\n\002\b\002\n\002\020\f\n\002\b\005\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\b\003\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000*\002JM\b2\030\0002\0020\0012\0020\002B%\b\004\022\006\020\003\032\0020\004\022\022\020\005\032\016\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\004\b\t\020\nJ\030\020\030\032\0020\0262\006\020\031\032\0020\0322\006\020\033\032\0020\034H\024J\020\020\035\032\0020\b2\006\020\036\032\0020\007H\026J\030\020\037\032\0020 2\006\020\031\032\0020\0322\006\020\033\032\0020\034H\026J\030\020!\032\0020\0262\006\020\"\032\0020\0262\006\020#\032\0020\026H\024J\030\020$\032\0020\b2\006\020%\032\0020\0262\006\020\036\032\0020\007H&J\b\020&\032\0020\007H&J\b\020'\032\0020\bH\026J\b\020(\032\0020\bH\026J\020\020)\032\0020\b2\006\020*\032\0020\026H\024J\030\020+\032\0020\b2\006\020*\032\0020\0262\006\020,\032\0020\034H\024J\030\020-\032\0020\b2\006\020*\032\0020\0262\006\020,\032\0020.H\024J\030\020/\032\0020\b2\006\020*\032\0020\0262\006\020,\032\00200H\024J\030\0201\032\0020\b2\006\020*\032\0020\0262\006\020,\032\00202H\024J\030\0203\032\0020\b2\006\020*\032\0020\0262\006\020,\032\00204H\024J)\0205\032\0020\b\"\004\b\000\02062\f\0207\032\b\022\004\022\002H6082\006\020,\032\002H6H\026¢\006\002\0209J\030\020:\032\0020\b2\006\020*\032\0020\0262\006\020,\032\0020;H\024J\030\020<\032\0020\b2\006\020*\032\0020\0262\006\020,\032\0020 H\024J\030\020=\032\0020\b2\006\020*\032\0020\0262\006\020,\032\0020>H\024J\030\020?\032\0020\b2\006\020*\032\0020\0262\006\020,\032\0020\026H\024J \020@\032\0020\b2\006\020*\032\0020\0262\006\020A\032\0020\0322\006\020B\032\0020\034H\024J\030\020C\032\0020\b2\006\020*\032\0020\0262\006\020,\032\0020DH\024J\030\020E\032\0020F2\006\020*\032\0020\0262\006\020G\032\0020\032H\024J\020\020H\032\0020F2\006\020\031\032\0020\032H\026J\025\020I\032\0020J2\006\020*\032\0020\026H\003¢\006\002\020KJ\035\020L\032\0020M2\006\020*\032\0020\0262\006\020G\032\0020\032H\002¢\006\002\020NJ\020\020O\032\0020P2\006\020\031\032\0020\032H\026J\020\020Q\032\0020\b2\006\020\031\032\0020\032H\024R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\013\020\fR \020\005\032\016\022\004\022\0020\007\022\004\022\0020\b0\006X\004¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\0208F¢\006\006\032\004\b\021\020\022R\020\020\023\032\0020\0248\004X\004¢\006\002\n\000R\020\020\025\032\004\030\0010\026X\016¢\006\002\n\000R\020\020\027\032\004\030\0010\026X\016¢\006\002\n\000\001\003RST¨\006U"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "Lkotlinx/serialization/internal/NamedValueEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "json", "Lkotlinx/serialization/json/Json;", "nodeConsumer", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "getJson", "()Lkotlinx/serialization/json/Json;", "getNodeConsumer", "()Lkotlin/jvm/functions/Function1;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "polymorphicDiscriminator", "", "polymorphicSerialName", "elementName", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "index", "", "encodeJsonElement", "element", "shouldEncodeElementDefault", "", "composeName", "parentName", "childName", "putElement", "key", "getCurrent", "encodeNotNullMark", "encodeNull", "encodeTaggedNull", "tag", "encodeTaggedInt", "value", "encodeTaggedByte", "", "encodeTaggedShort", "", "encodeTaggedLong", "", "encodeTaggedFloat", "", "encodeSerializableValue", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeTaggedDouble", "", "encodeTaggedBoolean", "encodeTaggedChar", "", "encodeTaggedString", "encodeTaggedEnum", "enumDescriptor", "ordinal", "encodeTaggedValue", "", "encodeTaggedInline", "Lkotlinx/serialization/encoding/Encoder;", "inlineDescriptor", "encodeInline", "inlineUnsignedNumberEncoder", "kotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1", "(Ljava/lang/String;)Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1;", "inlineUnquotedLiteralEncoder", "kotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeEncoder;", "endEncode", "Lkotlinx/serialization/json/internal/JsonPrimitiveEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeListEncoder;", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nTreeJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,279:1\n21#2,12:280\n35#2,15:293\n1#3:292\n36#4,9:308\n*S KotlinDebug\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n*L\n83#1:280,12\n83#1:293,15\n83#1:292\n153#1:308,9\n*E\n"})
/*     */ abstract class AbstractJsonTreeEncoder extends NamedValueEncoder implements JsonEncoder {
/*     */   @NotNull
/*     */   private final Json json;
/*     */   @NotNull
/*     */   private final Function1<JsonElement, Unit> nodeConsumer;
/*     */   
/*     */   @NotNull
/*  26 */   public final Json getJson() { return this.json; } @JvmField @NotNull protected final JsonConfiguration configuration; @Nullable private String polymorphicDiscriminator; @Nullable private String polymorphicSerialName; @NotNull
/*  27 */   protected final Function1<JsonElement, Unit> getNodeConsumer() { return this.nodeConsumer; } private AbstractJsonTreeEncoder(Json json, Function1<JsonElement, Unit> nodeConsumer) { this.json = json; this.nodeConsumer = nodeConsumer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  34 */     this.configuration = this.json.getConfiguration(); }
/*     */    @NotNull
/*     */   public final SerializersModule getSerializersModule() {
/*     */     return this.json.getSerializersModule();
/*     */   } @NotNull
/*     */   protected String elementName(@NotNull SerialDescriptor descriptor, int index) {
/*  40 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); return JsonNamesMapKt.getJsonElementName(descriptor, this.json, index);
/*     */   }
/*     */   public void encodeJsonElement(@NotNull JsonElement element) {
/*  43 */     Intrinsics.checkNotNullParameter(element, "element"); if (this.polymorphicDiscriminator != null && !(element instanceof kotlinx.serialization.json.JsonObject)) {
/*  44 */       PolymorphicKt.throwJsonElementPolymorphicException(this.polymorphicSerialName, element); throw new KotlinNothingValueException();
/*     */     } 
/*  46 */     encodeSerializableValue((SerializationStrategy<? super JsonElement>)JsonElementSerializer.INSTANCE, element);
/*     */   }
/*     */   
/*     */   public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int index) {
/*  50 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); return this.configuration.getEncodeDefaults(); } @NotNull
/*     */   protected String composeName(@NotNull String parentName, @NotNull String childName) {
/*  52 */     Intrinsics.checkNotNullParameter(parentName, "parentName"); Intrinsics.checkNotNullParameter(childName, "childName"); return childName;
/*     */   }
/*     */ 
/*     */   
/*     */   public void encodeNotNullMark() {}
/*     */ 
/*     */   
/*     */   public void encodeNull() {
/*     */     String tag;
/*  61 */     if ((String)getCurrentTagOrNull() == null) { (String)getCurrentTagOrNull(); this.nodeConsumer.invoke(JsonNull.INSTANCE); return; }
/*  62 */      encodeTaggedNull(tag);
/*     */   }
/*     */   protected void encodeTaggedNull(@NotNull String tag) {
/*  65 */     Intrinsics.checkNotNullParameter(tag, "tag"); putElement(tag, (JsonElement)JsonNull.INSTANCE);
/*     */   }
/*  67 */   protected void encodeTaggedInt(@NotNull String tag, int value) { Intrinsics.checkNotNullParameter(tag, "tag"); putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(Integer.valueOf(value))); }
/*  68 */   protected void encodeTaggedByte(@NotNull String tag, byte value) { Intrinsics.checkNotNullParameter(tag, "tag"); putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(Byte.valueOf(value))); }
/*  69 */   protected void encodeTaggedShort(@NotNull String tag, short value) { Intrinsics.checkNotNullParameter(tag, "tag"); putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(Short.valueOf(value))); } protected void encodeTaggedLong(@NotNull String tag, long value) {
/*  70 */     Intrinsics.checkNotNullParameter(tag, "tag"); putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(Long.valueOf(value)));
/*     */   }
/*     */   
/*     */   protected void encodeTaggedFloat(@NotNull String tag, float value) {
/*  74 */     Intrinsics.checkNotNullParameter(tag, "tag"); putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(Float.valueOf(value)));
/*  75 */     if (!this.configuration.getAllowSpecialFloatingPointValues()) { float f = value; if (!((!Float.isInfinite(f) && !Float.isNaN(f)) ? 1 : 0)) {
/*  76 */         throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(value), tag, getCurrent().toString());
/*     */       } }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> void encodeSerializableValue(@NotNull SerializationStrategy serializer, Object value) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'serializer'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: invokevirtual getCurrentTagOrNull : ()Ljava/lang/Object;
/*     */     //   10: ifnonnull -> 32
/*     */     //   13: aload_1
/*     */     //   14: invokeinterface getDescriptor : ()Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   19: aload_0
/*     */     //   20: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
/*     */     //   23: invokestatic carrierDescriptor : (Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   26: invokestatic access$getRequiresTopLevelTag : (Lkotlinx/serialization/descriptors/SerialDescriptor;)Z
/*     */     //   29: ifne -> 418
/*     */     //   32: aload_0
/*     */     //   33: checkcast kotlinx/serialization/json/JsonEncoder
/*     */     //   36: astore_3
/*     */     //   37: iconst_0
/*     */     //   38: istore #4
/*     */     //   40: aload_3
/*     */     //   41: invokeinterface getJson : ()Lkotlinx/serialization/json/Json;
/*     */     //   46: invokevirtual getConfiguration : ()Lkotlinx/serialization/json/JsonConfiguration;
/*     */     //   49: invokevirtual getUseArrayPolymorphism : ()Z
/*     */     //   52: ifeq -> 69
/*     */     //   55: aload_1
/*     */     //   56: aload_3
/*     */     //   57: checkcast kotlinx/serialization/encoding/Encoder
/*     */     //   60: aload_2
/*     */     //   61: invokeinterface serialize : (Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
/*     */     //   66: goto -> 449
/*     */     //   69: aload_1
/*     */     //   70: instanceof kotlinx/serialization/internal/AbstractPolymorphicSerializer
/*     */     //   73: istore #5
/*     */     //   75: iload #5
/*     */     //   77: ifeq -> 106
/*     */     //   80: aload_3
/*     */     //   81: invokeinterface getJson : ()Lkotlinx/serialization/json/Json;
/*     */     //   86: invokevirtual getConfiguration : ()Lkotlinx/serialization/json/JsonConfiguration;
/*     */     //   89: invokevirtual getClassDiscriminatorMode : ()Lkotlinx/serialization/json/ClassDiscriminatorMode;
/*     */     //   92: getstatic kotlinx/serialization/json/ClassDiscriminatorMode.NONE : Lkotlinx/serialization/json/ClassDiscriminatorMode;
/*     */     //   95: if_acmpeq -> 102
/*     */     //   98: iconst_1
/*     */     //   99: goto -> 210
/*     */     //   102: iconst_0
/*     */     //   103: goto -> 210
/*     */     //   106: aload_3
/*     */     //   107: invokeinterface getJson : ()Lkotlinx/serialization/json/Json;
/*     */     //   112: invokevirtual getConfiguration : ()Lkotlinx/serialization/json/JsonConfiguration;
/*     */     //   115: invokevirtual getClassDiscriminatorMode : ()Lkotlinx/serialization/json/ClassDiscriminatorMode;
/*     */     //   118: getstatic kotlinx/serialization/json/internal/PolymorphicKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   121: swap
/*     */     //   122: invokevirtual ordinal : ()I
/*     */     //   125: iaload
/*     */     //   126: tableswitch default -> 202, 1 -> 152, 2 -> 152, 3 -> 156
/*     */     //   152: iconst_0
/*     */     //   153: goto -> 210
/*     */     //   156: aload_1
/*     */     //   157: invokeinterface getDescriptor : ()Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   162: invokeinterface getKind : ()Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   167: astore #6
/*     */     //   169: iconst_0
/*     */     //   170: istore #7
/*     */     //   172: aload #6
/*     */     //   174: getstatic kotlinx/serialization/descriptors/StructureKind$CLASS.INSTANCE : Lkotlinx/serialization/descriptors/StructureKind$CLASS;
/*     */     //   177: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   180: ifne -> 194
/*     */     //   183: aload #6
/*     */     //   185: getstatic kotlinx/serialization/descriptors/StructureKind$OBJECT.INSTANCE : Lkotlinx/serialization/descriptors/StructureKind$OBJECT;
/*     */     //   188: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   191: ifeq -> 198
/*     */     //   194: iconst_1
/*     */     //   195: goto -> 199
/*     */     //   198: iconst_0
/*     */     //   199: goto -> 210
/*     */     //   202: new kotlin/NoWhenBranchMatchedException
/*     */     //   205: dup
/*     */     //   206: invokespecial <init> : ()V
/*     */     //   209: athrow
/*     */     //   210: istore #8
/*     */     //   212: iload #8
/*     */     //   214: ifeq -> 235
/*     */     //   217: aload_1
/*     */     //   218: invokeinterface getDescriptor : ()Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   223: aload_3
/*     */     //   224: invokeinterface getJson : ()Lkotlinx/serialization/json/Json;
/*     */     //   229: invokestatic classDiscriminator : (Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Ljava/lang/String;
/*     */     //   232: goto -> 236
/*     */     //   235: aconst_null
/*     */     //   236: astore #9
/*     */     //   238: iload #5
/*     */     //   240: ifeq -> 359
/*     */     //   243: aload_1
/*     */     //   244: checkcast kotlinx/serialization/internal/AbstractPolymorphicSerializer
/*     */     //   247: astore #10
/*     */     //   249: aload_2
/*     */     //   250: dup
/*     */     //   251: ifnonnull -> 305
/*     */     //   254: pop
/*     */     //   255: iconst_0
/*     */     //   256: istore #6
/*     */     //   258: new java/lang/StringBuilder
/*     */     //   261: dup
/*     */     //   262: invokespecial <init> : ()V
/*     */     //   265: ldc_w 'Value for serializer '
/*     */     //   268: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   271: aload_1
/*     */     //   272: checkcast kotlinx/serialization/internal/AbstractPolymorphicSerializer
/*     */     //   275: invokevirtual getDescriptor : ()Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   278: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   281: ldc_w ' should always be non-null. Please report issue to the kotlinx.serialization tracker.'
/*     */     //   284: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   287: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   290: astore #6
/*     */     //   292: new java/lang/IllegalArgumentException
/*     */     //   295: dup
/*     */     //   296: aload #6
/*     */     //   298: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   301: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   304: athrow
/*     */     //   305: pop
/*     */     //   306: aload #10
/*     */     //   308: aload_3
/*     */     //   309: checkcast kotlinx/serialization/encoding/Encoder
/*     */     //   312: aload_2
/*     */     //   313: invokestatic findPolymorphicSerializer : (Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;
/*     */     //   316: astore #6
/*     */     //   318: aload #9
/*     */     //   320: ifnull -> 346
/*     */     //   323: aload_1
/*     */     //   324: aload #6
/*     */     //   326: aload #9
/*     */     //   328: invokestatic access$validateIfSealed : (Lkotlinx/serialization/SerializationStrategy;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/String;)V
/*     */     //   331: aload #6
/*     */     //   333: invokeinterface getDescriptor : ()Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   338: invokeinterface getKind : ()Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   343: invokestatic checkKind : (Lkotlinx/serialization/descriptors/SerialKind;)V
/*     */     //   346: aload #6
/*     */     //   348: ldc_w 'null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>'
/*     */     //   351: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   354: aload #6
/*     */     //   356: goto -> 360
/*     */     //   359: aload_1
/*     */     //   360: astore #11
/*     */     //   362: aload #9
/*     */     //   364: ifnull -> 402
/*     */     //   367: aload #9
/*     */     //   369: aload #11
/*     */     //   371: invokeinterface getDescriptor : ()Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   376: invokeinterface getSerialName : ()Ljava/lang/String;
/*     */     //   381: astore #12
/*     */     //   383: astore #13
/*     */     //   385: iconst_0
/*     */     //   386: istore #14
/*     */     //   388: aload_0
/*     */     //   389: aload #13
/*     */     //   391: putfield polymorphicDiscriminator : Ljava/lang/String;
/*     */     //   394: aload_0
/*     */     //   395: aload #12
/*     */     //   397: putfield polymorphicSerialName : Ljava/lang/String;
/*     */     //   400: nop
/*     */     //   401: nop
/*     */     //   402: aload #11
/*     */     //   404: aload_3
/*     */     //   405: checkcast kotlinx/serialization/encoding/Encoder
/*     */     //   408: aload_2
/*     */     //   409: invokeinterface serialize : (Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
/*     */     //   414: nop
/*     */     //   415: goto -> 449
/*     */     //   418: new kotlinx/serialization/json/internal/JsonPrimitiveEncoder
/*     */     //   421: dup
/*     */     //   422: aload_0
/*     */     //   423: getfield json : Lkotlinx/serialization/json/Json;
/*     */     //   426: aload_0
/*     */     //   427: getfield nodeConsumer : Lkotlin/jvm/functions/Function1;
/*     */     //   430: invokespecial <init> : (Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V
/*     */     //   433: astore_3
/*     */     //   434: aload_3
/*     */     //   435: astore #4
/*     */     //   437: iconst_0
/*     */     //   438: istore #5
/*     */     //   440: aload #4
/*     */     //   442: aload_1
/*     */     //   443: aload_2
/*     */     //   444: invokevirtual encodeSerializableValue : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V
/*     */     //   447: nop
/*     */     //   448: nop
/*     */     //   449: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #82	-> 6
/*     */     //   #83	-> 32
/*     */     //   #280	-> 40
/*     */     //   #281	-> 55
/*     */     //   #282	-> 66
/*     */     //   #284	-> 69
/*     */     //   #286	-> 75
/*     */     //   #287	-> 80
/*     */     //   #289	-> 106
/*     */     //   #290	-> 152
/*     */     //   #291	-> 156
/*     */     //   #292	-> 169
/*     */     //   #291	-> 172
/*     */     //   #291	-> 199
/*     */     //   #289	-> 202
/*     */     //   #286	-> 210
/*     */     //   #285	-> 210
/*     */     //   #293	-> 212
/*     */     //   #294	-> 238
/*     */     //   #295	-> 243
/*     */     //   #296	-> 249
/*     */     //   #292	-> 255
/*     */     //   #296	-> 258
/*     */     //   #296	-> 290
/*     */     //   #297	-> 306
/*     */     //   #298	-> 318
/*     */     //   #299	-> 323
/*     */     //   #300	-> 331
/*     */     //   #302	-> 346
/*     */     //   #303	-> 359
/*     */     //   #294	-> 360
/*     */     //   #305	-> 362
/*     */     //   #84	-> 388
/*     */     //   #85	-> 394
/*     */     //   #86	-> 400
/*     */     //   #305	-> 401
/*     */     //   #306	-> 402
/*     */     //   #307	-> 414
/*     */     //   #87	-> 418
/*     */     //   #88	-> 440
/*     */     //   #89	-> 447
/*     */     //   #87	-> 448
/*     */     //   #90	-> 449
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   388	13	14	$i$a$-encodePolymorphically-AbstractJsonTreeEncoder$encodeSerializableValue$1	I
/*     */     //   385	16	13	discriminatorName	Ljava/lang/String;
/*     */     //   385	16	12	serialName	Ljava/lang/String;
/*     */     //   172	27	7	$i$a$-let-PolymorphicKt$encodePolymorphically$needDiscriminator$1$iv	I
/*     */     //   169	30	6	it$iv	Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   258	32	6	$i$a$-requireNotNull-PolymorphicKt$encodePolymorphically$actualSerializer$1$iv	I
/*     */     //   249	107	10	casted$iv	Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;
/*     */     //   318	38	6	actual$iv	Lkotlinx/serialization/SerializationStrategy;
/*     */     //   40	375	4	$i$f$encodePolymorphically	I
/*     */     //   75	340	5	isPolymorphicSerializer$iv	Z
/*     */     //   212	203	8	needDiscriminator$iv	Z
/*     */     //   238	177	9	baseClassDiscriminator$iv	Ljava/lang/String;
/*     */     //   362	53	11	actualSerializer$iv	Lkotlinx/serialization/SerializationStrategy;
/*     */     //   37	378	3	$this$encodePolymorphically$iv	Lkotlinx/serialization/json/JsonEncoder;
/*     */     //   440	8	5	$i$a$-apply-AbstractJsonTreeEncoder$encodeSerializableValue$2	I
/*     */     //   437	11	4	$this$encodeSerializableValue_u24lambda_u241	Lkotlinx/serialization/json/internal/JsonPrimitiveEncoder;
/*     */     //   0	450	0	this	Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;
/*     */     //   0	450	1	serializer	Lkotlinx/serialization/SerializationStrategy;
/*     */     //   0	450	2	value	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void encodeTaggedDouble(@NotNull String tag, double value) {
/*  94 */     Intrinsics.checkNotNullParameter(tag, "tag"); putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(Double.valueOf(value)));
/*  95 */     if (!this.configuration.getAllowSpecialFloatingPointValues()) { double d = value; if (!((!Double.isInfinite(d) && !Double.isNaN(d)) ? 1 : 0))
/*  96 */         throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(value), tag, getCurrent().toString());  }
/*     */   
/*     */   }
/*     */   
/* 100 */   protected void encodeTaggedBoolean(@NotNull String tag, boolean value) { Intrinsics.checkNotNullParameter(tag, "tag"); putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(Boolean.valueOf(value))); }
/* 101 */   protected void encodeTaggedChar(@NotNull String tag, char value) { Intrinsics.checkNotNullParameter(tag, "tag"); putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(String.valueOf(value))); } protected void encodeTaggedString(@NotNull String tag, @NotNull String value) {
/* 102 */     Intrinsics.checkNotNullParameter(tag, "tag"); Intrinsics.checkNotNullParameter(value, "value"); putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(value));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void encodeTaggedEnum(@NotNull String tag, @NotNull SerialDescriptor enumDescriptor, int ordinal) {
/* 107 */     Intrinsics.checkNotNullParameter(tag, "tag"); Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor"); putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(enumDescriptor.getElementName(ordinal)));
/*     */   }
/*     */   protected void encodeTaggedValue(@NotNull String tag, @NotNull Object value) {
/* 110 */     Intrinsics.checkNotNullParameter(tag, "tag"); Intrinsics.checkNotNullParameter(value, "value"); putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(value.toString()));
/*     */   }
/*     */   @NotNull
/*     */   protected Encoder encodeTaggedInline(@NotNull String tag, @NotNull SerialDescriptor inlineDescriptor) {
/* 114 */     Intrinsics.checkNotNullParameter(tag, "tag"); Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor"); return 
/* 115 */       StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? (Encoder)inlineUnsignedNumberEncoder(tag) : (
/* 116 */       StreamingJsonEncoderKt.isUnquotedLiteral(inlineDescriptor) ? (Encoder)inlineUnquotedLiteralEncoder(tag, inlineDescriptor) : super
/* 117 */       .encodeTaggedInline(tag, inlineDescriptor));
/*     */   }
/*     */   @NotNull
/*     */   public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
/* 121 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/* 122 */     if (this.polymorphicDiscriminator != null) this.polymorphicSerialName = descriptor.getSerialName();  return (getCurrentTagOrNull() != null) ? super
/* 123 */       .encodeInline(descriptor) : (
/*     */       
/* 125 */       new JsonPrimitiveEncoder(this.json, this.nodeConsumer)).encodeInline(descriptor);
/*     */   }
/*     */   
/*     */   @SuppressAnimalSniffer
/*     */   private final AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1 inlineUnsignedNumberEncoder(String tag) {
/* 130 */     return new AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1(tag); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0009\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\000\n\002\020\t\n\000\n\002\020\005\n\000\n\002\020\n\n\000*\001\000\b\n\030\0002\0020\001J\016\020\006\032\0020\0072\006\020\b\032\0020\tJ\020\020\n\032\0020\0072\006\020\013\032\0020\fH\026J\020\020\r\032\0020\0072\006\020\013\032\0020\016H\026J\020\020\017\032\0020\0072\006\020\013\032\0020\020H\026J\020\020\021\032\0020\0072\006\020\013\032\0020\022H\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\004\020\005¨\006\023"}, d2 = {"kotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1", "Lkotlinx/serialization/encoding/AbstractEncoder;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "putUnquotedString", "", "s", "", "encodeInt", "value", "", "encodeLong", "", "encodeByte", "", "encodeShort", "", "kotlinx-serialization-json"})
/* 131 */   public static final class AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1 extends AbstractEncoder { private final SerializersModule serializersModule; AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1(String $tag) { this.serializersModule = $receiver.getJson().getSerializersModule(); } public SerializersModule getSerializersModule() { return this.serializersModule; }
/*     */     
/* 133 */     public final void putUnquotedString(String s) { Intrinsics.checkNotNullParameter(s, "s"); AbstractJsonTreeEncoder.this.putElement(this.$tag, (JsonElement)new JsonLiteral(s, false, null, 4, null)); }
/* 134 */     public void encodeInt(int value) { putUnquotedString(Integer.toUnsignedString(UInt.constructor-impl(value))); }
/* 135 */     public void encodeLong(long value) { putUnquotedString(Long.toUnsignedString(ULong.constructor-impl(value))); }
/* 136 */     public void encodeByte(byte value) { putUnquotedString(UByte.toString-impl(UByte.constructor-impl(value))); } public void encodeShort(short value) {
/* 137 */       putUnquotedString(UShort.toString-impl(UShort.constructor-impl(value)));
/*     */     } }
/*     */   
/* 140 */   private final AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1 inlineUnquotedLiteralEncoder(String tag, SerialDescriptor inlineDescriptor) { return new AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1(tag, inlineDescriptor); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\026R\024\020\002\032\0020\0038VX\004¢\006\006\032\004\b\004\020\005¨\006\n"}, d2 = {"kotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1", "Lkotlinx/serialization/encoding/AbstractEncoder;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "encodeString", "", "value", "", "kotlinx-serialization-json"})
/* 141 */   public static final class AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1 extends AbstractEncoder { AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1(String $tag, SerialDescriptor $inlineDescriptor) {} public SerializersModule getSerializersModule() { return AbstractJsonTreeEncoder.this.getJson().getSerializersModule(); }
/*     */      public void encodeString(String value) {
/* 143 */       Intrinsics.checkNotNullParameter(value, "value"); AbstractJsonTreeEncoder.this.putElement(this.$tag, (JsonElement)new JsonLiteral(value, false, this.$inlineDescriptor));
/*     */     } }
/*     */   
/*     */   @NotNull
/*     */   public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor) {
/* 148 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); Function1<? super JsonElement, Unit> consumer = (getCurrentTagOrNull() == null) ? this.nodeConsumer : this::beginStructure$lambda$2;
/*     */ 
/*     */     
/* 151 */     SerialKind serialKind = descriptor.getKind();
/*     */     
/* 153 */     if (Intrinsics.areEqual(serialKind, StructureKind.MAP.INSTANCE)) { Json $this$selectMapMode$iv = this.json; int $i$f$selectMapMode = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 308 */       SerialDescriptor keyDescriptor$iv = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), $this$selectMapMode$iv.getSerializersModule());
/* 309 */       SerialKind keyKind$iv = keyDescriptor$iv.getKind();
/*     */       
/* 311 */       if (keyKind$iv instanceof kotlinx.serialization.descriptors.PrimitiveKind || Intrinsics.areEqual(keyKind$iv, SerialKind.ENUM.INSTANCE))
/* 312 */         int $i$a$-selectMapMode-AbstractJsonTreeEncoder$beginStructure$encoder$1 = 0; 
/* 313 */       if ($this$selectMapMode$iv.getConfiguration().getAllowStructuredMapKeys()) {
/* 314 */         int $i$a$-selectMapMode-AbstractJsonTreeEncoder$beginStructure$encoder$2 = 0;
/*     */       }
/* 316 */       throw JsonExceptionsKt.InvalidKeyKindException(keyDescriptor$iv); }
/*     */     
/*     */     AbstractJsonTreeEncoder encoder = (Intrinsics.areEqual(serialKind, StructureKind.LIST.INSTANCE) || serialKind instanceof kotlinx.serialization.descriptors.PolymorphicKind) ? new JsonTreeListEncoder(this.json, consumer) : new JsonTreeEncoder(this.json, consumer);
/*     */     String discriminator = this.polymorphicDiscriminator;
/*     */     if (discriminator != null) {
/*     */       if (encoder instanceof JsonTreeMapEncoder) {
/*     */         ((JsonTreeMapEncoder)encoder).putElement("key", (JsonElement)JsonElementKt.JsonPrimitive(discriminator));
/*     */         if (this.polymorphicSerialName == null);
/*     */         "value".putElement(this.polymorphicSerialName, (JsonElement)JsonElementKt.JsonPrimitive(descriptor.getSerialName()));
/*     */       } else {
/*     */         if (this.polymorphicSerialName == null);
/*     */         discriminator.putElement(this.polymorphicSerialName, (JsonElement)JsonElementKt.JsonPrimitive(descriptor.getSerialName()));
/*     */       } 
/*     */       this.polymorphicDiscriminator = null;
/*     */       this.polymorphicSerialName = null;
/*     */     } 
/*     */     return (CompositeEncoder)encoder;
/*     */   }
/*     */   
/*     */   private static final Unit beginStructure$lambda$2(AbstractJsonTreeEncoder this$0, JsonElement node) {
/*     */     Intrinsics.checkNotNullParameter(node, "node");
/*     */     this$0.putElement((String)this$0.getCurrentTag(), node);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   protected void endEncode(@NotNull SerialDescriptor descriptor) {
/*     */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*     */     this.nodeConsumer.invoke(getCurrent());
/*     */   }
/*     */   
/*     */   public abstract void putElement(@NotNull String paramString, @NotNull JsonElement paramJsonElement);
/*     */   
/*     */   @NotNull
/*     */   public abstract JsonElement getCurrent();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\AbstractJsonTreeEncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */