/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.SerializationException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.descriptors.SerialKind;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonDecoder;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonElementKt;
/*     */ import kotlinx.serialization.json.JsonObject;
/*     */ import kotlinx.serialization.json.JsonPrimitive;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000º\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\t\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\001\n\002\b\004\n\002\020\b\n\002\b\005\n\002\020\005\n\000\n\002\020\n\n\002\b\002\n\002\020\t\n\000\n\002\020\007\n\000\n\002\020\006\n\000\n\002\020\f\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b2\030\0002\0020\0012\0020\002B%\b\004\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\n\b\002\020\007\032\004\030\0010\b¢\006\004\b\t\020\nJ\b\020\027\032\0020\006H\004J\016\020\030\032\0020\b2\006\020\031\032\0020\bJ\b\020\032\032\0020\006H\026J!\020\033\032\002H\034\"\004\b\000\020\0342\f\020\035\032\b\022\004\022\002H\0340\036H\026¢\006\002\020\037J\030\020 \032\0020\b2\006\020!\032\0020\b2\006\020\"\032\0020\bH\024J\020\020#\032\0020$2\006\020%\032\0020&H\026J*\020'\032\002H\034\"\n\b\000\020\034\030\001*\0020\0062\006\020\005\032\0020\0062\006\020%\032\0020&H\b¢\006\002\020(J2\020'\032\002H\034\"\n\b\000\020\034\030\001*\0020\0062\006\020\005\032\0020\0062\006\020)\032\0020\b2\006\020*\032\0020\bH\b¢\006\002\020+J\020\020,\032\0020-2\006\020%\032\0020&H\026J\b\020.\032\0020/H\026J\031\0200\032\002012\006\020*\032\0020\b2\006\020%\032\0020&H\bJC\0200\032\002H\034\"\b\b\000\020\034*\002022\006\020*\032\0020\b2\006\0203\032\0020\b2\031\0204\032\025\022\004\022\00201\022\006\022\004\030\001H\03405¢\006\002\b6H\b¢\006\002\0207J \0208\032\002092\006\020:\032\002012\006\020;\032\0020\b2\006\020*\032\0020\bH\002J\020\020<\032\0020\0062\006\020*\032\0020\bH$J\030\020=\032\0020>2\006\020*\032\0020\b2\006\020?\032\0020&H\024J\022\020@\032\004\030\001092\006\020*\032\0020\bH\024J\020\020A\032\0020/2\006\020*\032\0020\bH\024J\020\020B\032\0020/2\006\020*\032\0020\bH\024J\020\020C\032\0020D2\006\020*\032\0020\bH\024J\020\020E\032\0020F2\006\020*\032\0020\bH\024J\020\020G\032\0020>2\006\020*\032\0020\bH\024J\020\020H\032\0020I2\006\020*\032\0020\bH\024J\020\020J\032\0020K2\006\020*\032\0020\bH\024J\020\020L\032\0020M2\006\020*\032\0020\bH\024J\020\020N\032\0020O2\006\020*\032\0020\bH\024J\020\020P\032\0020\b2\006\020*\032\0020\bH\024J\030\020Q\032\0020R2\006\020*\032\0020\b2\006\020S\032\0020&H\024J\020\020T\032\0020R2\006\020%\032\0020&H\026R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\r\020\016R\026\020\007\032\004\030\0010\bX\004¢\006\b\n\000\032\004\b\017\020\020R\024\020\021\032\0020\0228VX\004¢\006\006\032\004\b\023\020\024R\020\020\025\032\0020\0268\004X\004¢\006\002\n\000\001\003UVW¨\006X"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "Lkotlinx/serialization/internal/NamedValueDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "json", "Lkotlinx/serialization/json/Json;", "value", "Lkotlinx/serialization/json/JsonElement;", "polymorphicDiscriminator", "", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "getJson", "()Lkotlinx/serialization/json/Json;", "getValue", "()Lkotlinx/serialization/json/JsonElement;", "getPolymorphicDiscriminator", "()Ljava/lang/String;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "currentObject", "renderTagStack", "currentTag", "decodeJsonElement", "decodeSerializableValue", "T", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "composeName", "parentName", "childName", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "cast", "(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/JsonElement;", "serialName", "tag", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "endStructure", "", "decodeNotNullMark", "", "getPrimitiveValue", "Lkotlinx/serialization/json/JsonPrimitive;", "", "primitiveName", "convert", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "unparsedPrimitive", "", "literal", "primitive", "currentElement", "decodeTaggedEnum", "", "enumDescriptor", "decodeTaggedNull", "decodeTaggedNotNullMark", "decodeTaggedBoolean", "decodeTaggedByte", "", "decodeTaggedShort", "", "decodeTaggedInt", "decodeTaggedLong", "", "decodeTaggedFloat", "", "decodeTaggedDouble", "", "decodeTaggedChar", "", "decodeTaggedString", "decodeTaggedInline", "Lkotlinx/serialization/encoding/Decoder;", "inlineDescriptor", "decodeInline", "Lkotlinx/serialization/json/internal/JsonPrimitiveDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeListDecoder;", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 4 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 5 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,342:1\n73#1:367\n73#1:381\n73#1:392\n73#1:402\n74#1:427\n74#1:436\n84#1:445\n74#1:446\n87#1:455\n74#1:456\n88#1,5:465\n87#1:470\n74#1:471\n88#1,5:480\n87#1:485\n74#1:486\n88#1,5:495\n87#1:500\n74#1:501\n88#1,5:510\n87#1:515\n74#1:516\n88#1,5:525\n87#1:530\n74#1:531\n88#1,5:540\n87#1:545\n74#1:546\n88#1,5:555\n87#1:560\n74#1:561\n88#1,5:570\n74#1:575\n84#1:584\n74#1:585\n1#2:343\n78#3,6:344\n84#3,9:358\n270#4,8:350\n270#4,8:368\n270#4,8:382\n270#4,8:393\n270#4,8:403\n270#4,8:411\n270#4,8:419\n270#4,8:428\n270#4,8:437\n270#4,8:447\n270#4,8:457\n270#4,8:472\n270#4,8:487\n270#4,8:502\n270#4,8:517\n270#4,8:532\n270#4,8:547\n270#4,8:562\n270#4,8:576\n270#4,8:586\n36#5,5:376\n41#5,2:390\n44#5:401\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n*L\n63#1:367\n66#1:381\n67#1:392\n69#1:402\n84#1:427\n87#1:436\n104#1:445\n104#1:446\n111#1:455\n111#1:456\n111#1:465,5\n113#1:470\n113#1:471\n113#1:480,5\n119#1:485\n119#1:486\n119#1:495,5\n125#1:500\n125#1:501\n125#1:510,5\n131#1:515\n131#1:516\n131#1:525,5\n134#1:530\n134#1:531\n134#1:540,5\n141#1:545\n141#1:546\n141#1:555,5\n147#1:560\n147#1:561\n147#1:570,5\n150#1:575\n163#1:584\n163#1:585\n55#1:344,6\n55#1:358,9\n55#1:350,8\n63#1:368,8\n66#1:382,8\n67#1:393,8\n69#1:403,8\n73#1:411,8\n74#1:419,8\n84#1:428,8\n87#1:437,8\n104#1:447,8\n111#1:457,8\n113#1:472,8\n119#1:487,8\n125#1:502,8\n131#1:517,8\n134#1:532,8\n141#1:547,8\n147#1:562,8\n150#1:576,8\n163#1:586,8\n64#1:376,5\n64#1:390,2\n64#1:401\n*E\n"})
/*     */ abstract class AbstractJsonTreeDecoder extends NamedValueDecoder implements JsonDecoder {
/*     */   @NotNull
/*     */   private final Json json;
/*     */   @NotNull
/*     */   private final JsonElement value;
/*     */   @Nullable
/*     */   private final String polymorphicDiscriminator;
/*     */   @JvmField
/*     */   @NotNull
/*     */   protected final JsonConfiguration configuration;
/*     */   
/*     */   @NotNull
/*  37 */   public Json getJson() { return this.json; } @NotNull
/*  38 */   public JsonElement getValue() { return this.value; } @Nullable
/*  39 */   protected final String getPolymorphicDiscriminator() { return this.polymorphicDiscriminator; } private AbstractJsonTreeDecoder(Json json, JsonElement value, String polymorphicDiscriminator) { this.json = json; this.value = value; this.polymorphicDiscriminator = polymorphicDiscriminator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  46 */     this.configuration = getJson().getConfiguration(); }
/*     */   @NotNull public SerializersModule getSerializersModule() { return getJson().getSerializersModule(); }
/*  48 */   @NotNull public final String renderTagStack(@NotNull String currentTag) { Intrinsics.checkNotNullParameter(currentTag, "currentTag"); return renderTagStack() + '.' + currentTag; } @NotNull protected final JsonElement currentObject() { if ((String)getCurrentTagOrNull() != null) { String it = (String)getCurrentTagOrNull();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 343 */       int $i$a$-let-AbstractJsonTreeDecoder$currentObject$1 = 0; if (currentElement(it) == null) {
/*     */         currentElement(it); return getValue();
/*     */       }  return currentElement(it); }
/*     */      currentElement(it); return getValue(); }
/* 347 */   @NotNull public JsonElement decodeJsonElement() { return currentObject(); } public <T> T decodeSerializableValue(@NotNull DeserializationStrategy deserializer) { DeserializationStrategy<? extends T> deserializationStrategy2; Intrinsics.checkNotNullParameter(deserializer, "deserializer"); JsonDecoder $this$decodeSerializableValuePolymorphic$iv = this; int $i$f$decodeSerializableValuePolymorphic = 0; String discriminator$iv = PolymorphicKt.classDiscriminator(((AbstractPolymorphicSerializer)deserializer).getDescriptor(), $this$decodeSerializableValuePolymorphic$iv.getJson());
/*     */     
/* 349 */     JsonElement jsonElement = $this$decodeSerializableValuePolymorphic$iv.decodeJsonElement(); String serialName$iv$iv = ((AbstractPolymorphicSerializer)deserializer).getDescriptor().getSerialName(); int $i$f$cast = 0;
/* 350 */     if (!(jsonElement instanceof JsonObject)) {
/*     */ 
/*     */       
/* 353 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: "); byte b = -1; int $i$a$-decodeSerializableValuePolymorphic-AbstractJsonTreeDecoder$decodeSerializableValue$1 = 0;
/*     */       
/*     */       String str = renderTagStack();
/*     */     } 
/* 357 */     JsonObject jsonTree$iv = (JsonObject)jsonElement;
/* 358 */     JsonElementKt.getJsonPrimitive((JsonElement)jsonTree$iv.get(discriminator$iv)); String type$iv = ((JsonElement)jsonTree$iv.get(discriminator$iv) != null && JsonElementKt.getJsonPrimitive((JsonElement)jsonTree$iv.get(discriminator$iv)) != null) ? JsonElementKt.getContentOrNull(JsonElementKt.getJsonPrimitive((JsonElement)jsonTree$iv.get(discriminator$iv))) : null;
/*     */ 
/*     */     
/*     */     try {
/* 362 */       deserializationStrategy2 = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer)deserializer, (CompositeDecoder)$this$decodeSerializableValuePolymorphic$iv, type$iv);
/* 363 */     } catch (SerializationException it$iv) {
/* 364 */       Intrinsics.checkNotNull(it$iv.getMessage()); throw JsonExceptionsKt.JsonDecodingException(-1, it$iv.getMessage(), (CharSequence)jsonTree$iv.toString());
/*     */     }  DeserializationStrategy<? extends T> deserializationStrategy1 = deserializationStrategy2; Intrinsics.checkNotNull(deserializationStrategy1, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>"); DeserializationStrategy<? extends T> actualSerializer$iv = deserializationStrategy1;
/* 366 */     return (!(deserializer instanceof AbstractPolymorphicSerializer) || $this$decodeSerializableValuePolymorphic$iv.getJson().getConfiguration().getUseArrayPolymorphism()) ? (T)deserializer.deserialize((Decoder)$this$decodeSerializableValuePolymorphic$iv) : TreeJsonDecoderKt.<T>readPolymorphicJson($this$decodeSerializableValuePolymorphic$iv.getJson(), discriminator$iv, jsonTree$iv, actualSerializer$iv); } @NotNull protected String composeName(@NotNull String parentName, @NotNull String childName) { Intrinsics.checkNotNullParameter(parentName, "parentName"); Intrinsics.checkNotNullParameter(childName, "childName"); return childName; }
/* 367 */   @NotNull public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) { Intrinsics.checkNotNullParameter(descriptor, "descriptor"); JsonElement currentObject = currentObject(); SerialKind serialKind = descriptor.getKind(); AbstractJsonTreeDecoder this_$iv = this; int $i$f$cast = 0; String serialName$iv$iv = descriptor.getSerialName(); int i = 0;
/* 368 */     if (!(currentObject instanceof JsonArray)) {
/*     */ 
/*     */       
/* 371 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$1$iv = 0; String str = access$renderTagStack(this_$iv); throw JsonExceptionsKt.JsonDecodingException(b, stringBuilder.append(str).toString(), 
/* 372 */           (CharSequence)currentObject.toString());
/*     */     }  if (Intrinsics.areEqual(serialKind, StructureKind.MAP.INSTANCE)) {
/*     */       Json $this$selectMapMode$iv = getJson();
/*     */       int $i$f$selectMapMode = 0;
/* 376 */       SerialDescriptor keyDescriptor$iv = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), $this$selectMapMode$iv.getSerializersModule());
/* 377 */       SerialKind keyKind$iv = keyDescriptor$iv.getKind();
/*     */       
/* 379 */       if (keyKind$iv instanceof kotlinx.serialization.descriptors.PrimitiveKind || Intrinsics.areEqual(keyKind$iv, SerialKind.ENUM.INSTANCE)) {
/* 380 */         int $i$a$-selectMapMode-AbstractJsonTreeDecoder$beginStructure$1 = 0; AbstractJsonTreeDecoder abstractJsonTreeDecoder = this; int j = 0;
/* 381 */         String str = descriptor.getSerialName(); int k = 0;
/* 382 */         if (!(currentObject instanceof JsonObject)) {
/*     */ 
/*     */           
/* 385 */           StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName()).append(" as the serialized body of ").append(str).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$1$iv = 0; String str1 = access$renderTagStack(abstractJsonTreeDecoder); throw JsonExceptionsKt.JsonDecodingException(b, stringBuilder.append(str1).toString(), 
/* 386 */               (CharSequence)currentObject.toString());
/*     */         } 
/*     */       } 
/*     */       
/* 390 */       if ($this$selectMapMode$iv.getConfiguration().getAllowStructuredMapKeys()) {
/* 391 */         int $i$a$-selectMapMode-AbstractJsonTreeDecoder$beginStructure$2 = 0; AbstractJsonTreeDecoder abstractJsonTreeDecoder = this; int j = 0;
/* 392 */         String str = descriptor.getSerialName(); int k = 0;
/* 393 */         if (!(currentObject instanceof JsonArray)) {
/*     */ 
/*     */           
/* 396 */           StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName()).append(" as the serialized body of ").append(str).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$1$iv = 0; String str1 = access$renderTagStack(abstractJsonTreeDecoder); throw JsonExceptionsKt.JsonDecodingException(b, stringBuilder.append(str1).toString(), 
/* 397 */               (CharSequence)currentObject.toString());
/*     */         } 
/*     */       } 
/*     */       
/* 401 */       throw JsonExceptionsKt.InvalidKeyKindException(keyDescriptor$iv);
/* 402 */     }  this_$iv = this; $i$f$cast = 0; serialName$iv$iv = descriptor.getSerialName(); i = 0;
/* 403 */     if (!(currentObject instanceof JsonObject)) {
/*     */ 
/*     */       
/* 406 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$1$iv = 0; String str = access$renderTagStack(this_$iv); throw JsonExceptionsKt.JsonDecodingException(b, stringBuilder.append(str).toString(), 
/* 407 */           (CharSequence)currentObject.toString());
/*     */     } 
/*     */     
/* 410 */     return (Intrinsics.areEqual(serialKind, StructureKind.LIST.INSTANCE) || serialKind instanceof kotlinx.serialization.descriptors.PolymorphicKind) ? (CompositeDecoder)new JsonTreeListDecoder(getJson(), (JsonArray)currentObject) : (CompositeDecoder)new JsonTreeDecoder(getJson(), (JsonObject)currentObject, this.polymorphicDiscriminator, null, 8, null); }
/*     */   
/*     */   public void endStructure(@NotNull SerialDescriptor descriptor) {
/*     */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*     */   }
/*     */   public boolean decodeNotNullMark() {
/*     */     return !(currentObject() instanceof JsonNull);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected final JsonPrimitive getPrimitiveValue(@NotNull String tag, @NotNull SerialDescriptor descriptor) { Intrinsics.checkNotNullParameter(tag, "tag");
/*     */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*     */     int $i$f$getPrimitiveValue = 0;
/*     */     AbstractJsonTreeDecoder abstractJsonTreeDecoder = this;
/*     */     JsonElement jsonElement = access$currentElement(this, tag);
/*     */     String serialName$iv = descriptor.getSerialName();
/*     */     int $i$f$cast = 0;
/* 427 */     int i = 0;
/* 428 */     if (!(jsonElement instanceof JsonPrimitive)) {
/*     */ 
/*     */       
/* 431 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$2$iv = 0;
/*     */       
/*     */       String str = abstractJsonTreeDecoder.renderTagStack(tag);
/*     */     } 
/* 435 */     return (JsonPrimitive)jsonElement; } private final <T> T getPrimitiveValue(String tag, String primitiveName, Function1 convert) { int $i$f$getPrimitiveValue = 0; AbstractJsonTreeDecoder abstractJsonTreeDecoder = this; JsonElement value$iv = currentElement(tag); int $i$f$cast = 0;
/* 436 */     int i = 0;
/* 437 */     if (!(value$iv instanceof JsonPrimitive)) {
/*     */ 
/*     */       
/* 440 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$2$iv = 0;
/*     */       
/*     */       String str = abstractJsonTreeDecoder.renderTagStack(tag);
/*     */     } 
/* 444 */     JsonPrimitive literal = (JsonPrimitive)value$iv; try { if (convert.invoke(literal) == null) { convert.invoke(literal); unparsedPrimitive(literal, primitiveName, tag); throw new KotlinNothingValueException(); }  return (T)convert.invoke(literal); } catch (IllegalArgumentException e) { unparsedPrimitive(literal, primitiveName, tag); throw new KotlinNothingValueException(); }  } private final Void unparsedPrimitive(JsonPrimitive literal, String primitive, String tag) { String type = StringsKt.startsWith$default(primitive, "i", false, 2, null) ? ("an " + primitive) : ("a " + primitive); throw JsonExceptionsKt.JsonDecodingException(-1, "Failed to parse literal '" + literal + "' as " + type + " value at element: " + renderTagStack(tag), (CharSequence)currentObject().toString()); }
/* 445 */   protected int decodeTaggedEnum(@NotNull String tag, @NotNull SerialDescriptor enumDescriptor) { Intrinsics.checkNotNullParameter(tag, "tag"); Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor"); AbstractJsonTreeDecoder this_$iv = this; int $i$f$getPrimitiveValue = 0; AbstractJsonTreeDecoder abstractJsonTreeDecoder1 = this_$iv; JsonElement jsonElement = access$currentElement(this_$iv, tag); String serialName$iv$iv = enumDescriptor.getSerialName(); int $i$f$cast = 0;
/* 446 */     int i = 0;
/* 447 */     if (!(jsonElement instanceof JsonPrimitive)) {
/*     */ 
/*     */       
/* 450 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$2$iv$iv = 0; String str = abstractJsonTreeDecoder1.renderTagStack(tag); throw JsonExceptionsKt.JsonDecodingException(b, stringBuilder.append(str).toString(), 
/* 451 */           (CharSequence)jsonElement.toString());
/*     */     } 
/*     */     
/* 454 */     return JsonNamesMapKt.getJsonNameIndexOrThrow$default(enumDescriptor, getJson(), ((JsonPrimitive)jsonElement).getContent(), null, 4, null); } @Nullable protected Void decodeTaggedNull(@NotNull String tag) { Intrinsics.checkNotNullParameter(tag, "tag"); return null; } protected boolean decodeTaggedNotNullMark(@NotNull String tag) { Intrinsics.checkNotNullParameter(tag, "tag"); return (currentElement(tag) != JsonNull.INSTANCE); }
/* 455 */   protected boolean decodeTaggedBoolean(@NotNull String tag) { Intrinsics.checkNotNullParameter(tag, "tag"); AbstractJsonTreeDecoder abstractJsonTreeDecoder1 = this; String primitiveName$iv = "boolean"; int $i$f$getPrimitiveValue = 0; AbstractJsonTreeDecoder abstractJsonTreeDecoder2 = abstractJsonTreeDecoder1; JsonElement value$iv$iv = abstractJsonTreeDecoder1.currentElement(tag); int $i$f$cast = 0;
/* 456 */     int i = 0;
/* 457 */     if (!(value$iv$iv instanceof JsonPrimitive)) {
/*     */ 
/*     */       
/* 460 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$2$iv$iv = 0;
/*     */       
/*     */       String str = abstractJsonTreeDecoder2.renderTagStack(tag);
/*     */     } 
/* 464 */     JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;
/*     */     
/* 466 */     try { JsonPrimitive p0 = literal$iv; int $i$a$-getPrimitiveValue-AbstractJsonTreeDecoder$decodeTaggedBoolean$1 = 0; if (JsonElementKt.getBooleanOrNull(p0) == null) { JsonElementKt.getBooleanOrNull(p0); abstractJsonTreeDecoder1.unparsedPrimitive(literal$iv, primitiveName$iv, tag); throw new KotlinNothingValueException(); }  }
/* 467 */     catch (IllegalArgumentException e$iv)
/*     */     
/* 469 */     { abstractJsonTreeDecoder1.unparsedPrimitive(literal$iv, primitiveName$iv, tag); throw new KotlinNothingValueException(); }  return JsonElementKt.getBooleanOrNull(p0).booleanValue(); } protected byte decodeTaggedByte(@NotNull String tag) { Intrinsics.checkNotNullParameter(tag, "tag"); AbstractJsonTreeDecoder abstractJsonTreeDecoder1 = this; String primitiveName$iv = "byte"; int $i$f$getPrimitiveValue = 0;
/* 470 */     AbstractJsonTreeDecoder abstractJsonTreeDecoder2 = abstractJsonTreeDecoder1; JsonElement value$iv$iv = abstractJsonTreeDecoder1.currentElement(tag); int $i$f$cast = 0;
/* 471 */     int i = 0;
/* 472 */     if (!(value$iv$iv instanceof JsonPrimitive)) {
/*     */ 
/*     */       
/* 475 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$2$iv$iv = 0;
/*     */       
/*     */       String str = abstractJsonTreeDecoder2.renderTagStack(tag);
/*     */     } 
/* 479 */     JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;
/*     */     
/* 481 */     try { JsonPrimitive $this$decodeTaggedByte_u24lambda_u246 = literal$iv; int $i$a$-getPrimitiveValue-AbstractJsonTreeDecoder$decodeTaggedByte$1 = 0; long result = JsonElementKt.parseLongImpl($this$decodeTaggedByte_u24lambda_u246); if ((((-128L <= result) ? ((result <= 127L)) : false) ? Byte.valueOf((byte)(int)result) : null) == null) { ((-128L <= result) ? ((result <= 127L)) : false) ? Byte.valueOf((byte)(int)result) : null; abstractJsonTreeDecoder1.unparsedPrimitive(literal$iv, primitiveName$iv, tag); throw new KotlinNothingValueException(); }  }
/* 482 */     catch (IllegalArgumentException e$iv)
/*     */     
/* 484 */     { abstractJsonTreeDecoder1.unparsedPrimitive(literal$iv, primitiveName$iv, tag); throw new KotlinNothingValueException(); }  return ((Number)(((-128L <= result) ? ((result <= 127L)) : false) ? Byte.valueOf((byte)(int)result) : null)).byteValue(); } protected short decodeTaggedShort(@NotNull String tag) { Intrinsics.checkNotNullParameter(tag, "tag"); AbstractJsonTreeDecoder abstractJsonTreeDecoder1 = this; String primitiveName$iv = "short"; int $i$f$getPrimitiveValue = 0;
/* 485 */     AbstractJsonTreeDecoder abstractJsonTreeDecoder2 = abstractJsonTreeDecoder1; JsonElement value$iv$iv = abstractJsonTreeDecoder1.currentElement(tag); int $i$f$cast = 0;
/* 486 */     int i = 0;
/* 487 */     if (!(value$iv$iv instanceof JsonPrimitive)) {
/*     */ 
/*     */       
/* 490 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$2$iv$iv = 0;
/*     */       
/*     */       String str = abstractJsonTreeDecoder2.renderTagStack(tag);
/*     */     } 
/* 494 */     JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;
/*     */     
/* 496 */     try { JsonPrimitive $this$decodeTaggedShort_u24lambda_u247 = literal$iv; int $i$a$-getPrimitiveValue-AbstractJsonTreeDecoder$decodeTaggedShort$1 = 0; long result = JsonElementKt.parseLongImpl($this$decodeTaggedShort_u24lambda_u247); if ((((-32768L <= result) ? ((result <= 32767L)) : false) ? Short.valueOf((short)(int)result) : null) == null) { ((-32768L <= result) ? ((result <= 32767L)) : false) ? Short.valueOf((short)(int)result) : null; abstractJsonTreeDecoder1.unparsedPrimitive(literal$iv, primitiveName$iv, tag); throw new KotlinNothingValueException(); }  }
/* 497 */     catch (IllegalArgumentException e$iv)
/*     */     
/* 499 */     { abstractJsonTreeDecoder1.unparsedPrimitive(literal$iv, primitiveName$iv, tag); throw new KotlinNothingValueException(); }  return ((Number)(((-32768L <= result) ? ((result <= 32767L)) : false) ? Short.valueOf((short)(int)result) : null)).shortValue(); } protected int decodeTaggedInt(@NotNull String tag) { Intrinsics.checkNotNullParameter(tag, "tag"); AbstractJsonTreeDecoder abstractJsonTreeDecoder1 = this; String primitiveName$iv = "int"; int $i$f$getPrimitiveValue = 0;
/* 500 */     AbstractJsonTreeDecoder abstractJsonTreeDecoder2 = abstractJsonTreeDecoder1; JsonElement value$iv$iv = abstractJsonTreeDecoder1.currentElement(tag); int $i$f$cast = 0;
/* 501 */     int i = 0;
/* 502 */     if (!(value$iv$iv instanceof JsonPrimitive)) {
/*     */ 
/*     */       
/* 505 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$2$iv$iv = 0;
/*     */       
/*     */       String str = abstractJsonTreeDecoder2.renderTagStack(tag);
/*     */     } 
/* 509 */     JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;
/*     */     
/* 511 */     try { JsonPrimitive $this$decodeTaggedInt_u24lambda_u248 = literal$iv; int $i$a$-getPrimitiveValue-AbstractJsonTreeDecoder$decodeTaggedInt$1 = 0; long result = JsonElementKt.parseLongImpl($this$decodeTaggedInt_u24lambda_u248); if ((((-2147483648L <= result) ? ((result <= 2147483647L)) : false) ? Integer.valueOf((int)result) : null) == null) { ((-2147483648L <= result) ? ((result <= 2147483647L)) : false) ? Integer.valueOf((int)result) : null; abstractJsonTreeDecoder1.unparsedPrimitive(literal$iv, primitiveName$iv, tag); throw new KotlinNothingValueException(); }  }
/* 512 */     catch (IllegalArgumentException e$iv)
/*     */     
/* 514 */     { abstractJsonTreeDecoder1.unparsedPrimitive(literal$iv, primitiveName$iv, tag); throw new KotlinNothingValueException(); }  return ((Number)(((-2147483648L <= result) ? ((result <= 2147483647L)) : false) ? Integer.valueOf((int)result) : null)).intValue(); } protected long decodeTaggedLong(@NotNull String tag) { Intrinsics.checkNotNullParameter(tag, "tag"); AbstractJsonTreeDecoder abstractJsonTreeDecoder1 = this; String primitiveName$iv = "long"; int $i$f$getPrimitiveValue = 0;
/* 515 */     AbstractJsonTreeDecoder abstractJsonTreeDecoder2 = abstractJsonTreeDecoder1; JsonElement value$iv$iv = abstractJsonTreeDecoder1.currentElement(tag); int $i$f$cast = 0;
/* 516 */     int i = 0;
/* 517 */     if (!(value$iv$iv instanceof JsonPrimitive)) {
/*     */ 
/*     */       
/* 520 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$2$iv$iv = 0;
/*     */       
/*     */       String str = abstractJsonTreeDecoder2.renderTagStack(tag);
/*     */     } 
/* 524 */     JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;
/*     */     try {
/* 526 */       JsonPrimitive $this$decodeTaggedLong_u24lambda_u249 = literal$iv; int $i$a$-getPrimitiveValue-AbstractJsonTreeDecoder$decodeTaggedLong$1 = 0;
/* 527 */     } catch (IllegalArgumentException e$iv) {
/*     */       
/* 529 */       abstractJsonTreeDecoder1.unparsedPrimitive(literal$iv, primitiveName$iv, tag); throw new KotlinNothingValueException();
/* 530 */     }  return JsonElementKt.parseLongImpl($this$decodeTaggedLong_u24lambda_u249); } protected float decodeTaggedFloat(@NotNull String tag) { Intrinsics.checkNotNullParameter(tag, "tag"); AbstractJsonTreeDecoder abstractJsonTreeDecoder1 = this; String primitiveName$iv = "float"; int $i$f$getPrimitiveValue = 0; AbstractJsonTreeDecoder abstractJsonTreeDecoder2 = abstractJsonTreeDecoder1; JsonElement value$iv$iv = abstractJsonTreeDecoder1.currentElement(tag); int $i$f$cast = 0;
/* 531 */     int i = 0;
/* 532 */     if (!(value$iv$iv instanceof JsonPrimitive)) {
/*     */ 
/*     */       
/* 535 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$2$iv$iv = 0;
/*     */       
/*     */       String str = abstractJsonTreeDecoder2.renderTagStack(tag);
/*     */     } 
/* 539 */     JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;
/*     */     
/* 541 */     try { JsonPrimitive $this$decodeTaggedFloat_u24lambda_u2410 = literal$iv; int $i$a$-getPrimitiveValue-AbstractJsonTreeDecoder$decodeTaggedFloat$result$1 = 0; }
/* 542 */     catch (IllegalArgumentException e$iv)
/*     */     
/* 544 */     { abstractJsonTreeDecoder1.unparsedPrimitive(literal$iv, primitiveName$iv, tag); throw new KotlinNothingValueException(); }  float result = JsonElementKt.getFloat($this$decodeTaggedFloat_u24lambda_u2410); boolean specialFp = getJson().getConfiguration().getAllowSpecialFloatingPointValues(); if (!specialFp) { float f = result; if (!((!Float.isInfinite(f) && !Float.isNaN(f)) ? 1 : 0))
/* 545 */         throw JsonExceptionsKt.InvalidFloatingPointDecoded(Float.valueOf(result), tag, currentObject().toString());  }  return result; } protected double decodeTaggedDouble(@NotNull String tag) { Intrinsics.checkNotNullParameter(tag, "tag"); AbstractJsonTreeDecoder abstractJsonTreeDecoder1 = this; String primitiveName$iv = "double"; int $i$f$getPrimitiveValue = 0; AbstractJsonTreeDecoder abstractJsonTreeDecoder2 = abstractJsonTreeDecoder1; JsonElement value$iv$iv = abstractJsonTreeDecoder1.currentElement(tag); int $i$f$cast = 0;
/* 546 */     int i = 0;
/* 547 */     if (!(value$iv$iv instanceof JsonPrimitive)) {
/*     */ 
/*     */       
/* 550 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$2$iv$iv = 0;
/*     */       
/*     */       String str = abstractJsonTreeDecoder2.renderTagStack(tag);
/*     */     } 
/* 554 */     JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;
/*     */     
/* 556 */     try { JsonPrimitive $this$decodeTaggedDouble_u24lambda_u2411 = literal$iv; int $i$a$-getPrimitiveValue-AbstractJsonTreeDecoder$decodeTaggedDouble$result$1 = 0; }
/* 557 */     catch (IllegalArgumentException e$iv)
/*     */     
/* 559 */     { abstractJsonTreeDecoder1.unparsedPrimitive(literal$iv, primitiveName$iv, tag); throw new KotlinNothingValueException(); }  double result = JsonElementKt.getDouble($this$decodeTaggedDouble_u24lambda_u2411); boolean specialFp = getJson().getConfiguration().getAllowSpecialFloatingPointValues(); if (!specialFp) { double d = result; if (!((!Double.isInfinite(d) && !Double.isNaN(d)) ? 1 : 0))
/* 560 */         throw JsonExceptionsKt.InvalidFloatingPointDecoded(Double.valueOf(result), tag, currentObject().toString());  }  return result; } protected char decodeTaggedChar(@NotNull String tag) { Intrinsics.checkNotNullParameter(tag, "tag"); AbstractJsonTreeDecoder abstractJsonTreeDecoder1 = this; String primitiveName$iv = "char"; int $i$f$getPrimitiveValue = 0; AbstractJsonTreeDecoder abstractJsonTreeDecoder2 = abstractJsonTreeDecoder1; JsonElement value$iv$iv = abstractJsonTreeDecoder1.currentElement(tag); int $i$f$cast = 0;
/* 561 */     int i = 0;
/* 562 */     if (!(value$iv$iv instanceof JsonPrimitive)) {
/*     */ 
/*     */       
/* 565 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$2$iv$iv = 0;
/*     */       
/*     */       String str = abstractJsonTreeDecoder2.renderTagStack(tag);
/*     */     } 
/* 569 */     JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;
/*     */     try {
/* 571 */       JsonPrimitive $this$decodeTaggedChar_u24lambda_u2412 = literal$iv; int $i$a$-getPrimitiveValue-AbstractJsonTreeDecoder$decodeTaggedChar$1 = 0;
/* 572 */     } catch (IllegalArgumentException e$iv) {
/*     */       
/* 574 */       abstractJsonTreeDecoder1.unparsedPrimitive(literal$iv, primitiveName$iv, tag); throw new KotlinNothingValueException();
/* 575 */     }  return StringsKt.single($this$decodeTaggedChar_u24lambda_u2412.getContent()); } @NotNull protected String decodeTaggedString(@NotNull String tag) { Intrinsics.checkNotNullParameter(tag, "tag"); AbstractJsonTreeDecoder abstractJsonTreeDecoder = this; JsonElement jsonElement = currentElement(tag); String serialName$iv = "string"; int $i$f$cast = 0; int i = 0;
/* 576 */     if (!(jsonElement instanceof JsonPrimitive)) {
/*     */ 
/*     */       
/* 579 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$2$iv = 0;
/*     */       
/*     */       String str = abstractJsonTreeDecoder.renderTagStack(tag);
/*     */     } 
/* 583 */     JsonPrimitive value = (JsonPrimitive)jsonElement; if (!(value instanceof JsonLiteral)) throw JsonExceptionsKt.JsonDecodingException(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + renderTagStack(tag), (CharSequence)currentObject().toString());  if (!((JsonLiteral)value).isString() && !getJson().getConfiguration().isLenient())
/* 584 */       throw JsonExceptionsKt.JsonDecodingException(-1, "String literal for key '" + tag + "' should be quoted at element: " + renderTagStack(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", (CharSequence)currentObject().toString());  return ((JsonLiteral)value).getContent(); } @NotNull protected Decoder decodeTaggedInline(@NotNull String tag, @NotNull SerialDescriptor inlineDescriptor) { Intrinsics.checkNotNullParameter(tag, "tag"); Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor"); AbstractJsonTreeDecoder this_$iv = this; int $i$f$getPrimitiveValue = 0; AbstractJsonTreeDecoder abstractJsonTreeDecoder1 = this_$iv; JsonElement jsonElement = access$currentElement(this_$iv, tag); String serialName$iv$iv = inlineDescriptor.getSerialName(); int $i$f$cast = 0;
/* 585 */     int i = 0;
/* 586 */     if (!(jsonElement instanceof JsonPrimitive)) {
/*     */ 
/*     */       
/* 589 */       StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$2$iv$iv = 0; String str = abstractJsonTreeDecoder1.renderTagStack(tag); throw JsonExceptionsKt.JsonDecodingException(b, stringBuilder.append(str).toString(), 
/* 590 */           (CharSequence)jsonElement.toString());
/*     */     } 
/*     */     
/* 593 */     StringJsonLexer lexer = StringJsonLexerKt.StringJsonLexer(getJson(), ((JsonPrimitive)jsonElement).getContent());
/*     */     return StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? (Decoder)new JsonDecoderForUnsignedTypes(lexer, getJson()) : super.decodeTaggedInline(tag, inlineDescriptor); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Decoder decodeInline(@NotNull SerialDescriptor descriptor) {
/*     */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*     */     return (getCurrentTagOrNull() != null) ? super.decodeInline(descriptor) : (new JsonPrimitiveDecoder(getJson(), getValue(), this.polymorphicDiscriminator)).decodeInline(descriptor);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected abstract JsonElement currentElement(@NotNull String paramString);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\AbstractJsonTreeDecoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */