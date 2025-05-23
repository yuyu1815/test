/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.descriptors.SerialKind;
/*     */ import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
/*     */ import kotlinx.serialization.json.ClassDiscriminatorMode;
/*     */ import kotlinx.serialization.json.JsonDecoder;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonElementKt;
/*     */ import kotlinx.serialization.json.JsonEncoder;
/*     */ import kotlinx.serialization.json.JsonObject;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000V\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\t\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\001\n\000\n\002\030\002\n\000\032i\020\000\032\0020\001\"\004\b\000\020\002*\0020\0032\f\020\004\032\b\022\004\022\002H\0020\0052\006\020\006\032\002H\00226\020\007\0322\022\023\022\0210\t¢\006\f\b\n\022\b\b\013\022\004\b\b(\f\022\023\022\0210\t¢\006\f\b\n\022\b\b\013\022\004\b\b(\r\022\004\022\0020\0010\bH\bø\001\000¢\006\002\020\016\032(\020\017\032\0020\0012\n\020\004\032\006\022\002\b\0030\0052\n\020\020\032\006\022\002\b\0030\0052\006\020\021\032\0020\tH\002\032\020\020\022\032\0020\0012\006\020\023\032\0020\024H\000\0327\020\025\032\002H\002\"\004\b\000\020\002*\0020\0262\f\020\027\032\b\022\004\022\002H\0020\0302\f\020\031\032\b\022\004\022\0020\t0\032H\bø\001\000¢\006\002\020\033\032\024\020\021\032\0020\t*\0020\0342\006\020\035\032\0020\036H\000\032\032\020\037\032\0020 2\b\020\r\032\004\030\0010\t2\006\020!\032\0020\"H\000\002\007\n\005\b20\001¨\006#"}, d2 = {"encodePolymorphically", "", "T", "Lkotlinx/serialization/json/JsonEncoder;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "ifPolymorphic", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "discriminatorName", "serialName", "(Lkotlinx/serialization/json/JsonEncoder;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "validateIfSealed", "actualSerializer", "classDiscriminator", "checkKind", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "decodeSerializableValuePolymorphic", "Lkotlinx/serialization/json/JsonDecoder;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "path", "Lkotlin/Function0;", "(Lkotlinx/serialization/json/JsonDecoder;Lkotlinx/serialization/DeserializationStrategy;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "json", "Lkotlinx/serialization/json/Json;", "throwJsonElementPolymorphicException", "", "element", "Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nPolymorphic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,109:1\n1#2:110\n270#3,8:111\n*S KotlinDebug\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n*L\n83#1:111,8\n*E\n"})
/*     */ public final class PolymorphicKt {
/*     */   public static final <T> void encodePolymorphically(@NotNull JsonEncoder $this$encodePolymorphically, @NotNull SerializationStrategy serializer, Object value, @NotNull Function2 ifPolymorphic) { SerialKind it;
/*     */     int $i$a$-let-PolymorphicKt$encodePolymorphically$needDiscriminator$1;
/*  21 */     Intrinsics.checkNotNullParameter($this$encodePolymorphically, "<this>"); Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(ifPolymorphic, "ifPolymorphic"); int $i$f$encodePolymorphically = 0; if ($this$encodePolymorphically.getJson().getConfiguration().getUseArrayPolymorphism()) {
/*  22 */       serializer.serialize((Encoder)$this$encodePolymorphically, value);
/*     */       return;
/*     */     } 
/*  25 */     boolean isPolymorphicSerializer = serializer instanceof AbstractPolymorphicSerializer;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  30 */     switch (WhenMappings.$EnumSwitchMapping$0[$this$encodePolymorphically.getJson().getConfiguration().getClassDiscriminatorMode().ordinal()]) { case 1: case 2: 
/*     */       case 3:
/*  32 */         it = serializer.getDescriptor().getKind();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 110 */         $i$a$-let-PolymorphicKt$encodePolymorphically$needDiscriminator$1 = 0;default: throw new NoWhenBranchMatchedException(); }  boolean needDiscriminator = isPolymorphicSerializer ? (($this$encodePolymorphically.getJson().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE)) : "JD-Core does not support Kotlin"; String baseClassDiscriminator = needDiscriminator ? classDiscriminator(serializer.getDescriptor(), $this$encodePolymorphically.getJson()) : null; AbstractPolymorphicSerializer casted = (AbstractPolymorphicSerializer)serializer; if (value == null) { int $i$a$-requireNotNull-PolymorphicKt$encodePolymorphically$actualSerializer$1 = 0; String str = "Value for serializer " + ((AbstractPolymorphicSerializer)serializer).getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker."; throw new IllegalArgumentException(str.toString()); }  SerializationStrategy actual = PolymorphicSerializerKt.findPolymorphicSerializer(casted, (Encoder)$this$encodePolymorphically, value); if (baseClassDiscriminator != null) { validateIfSealed(serializer, actual, baseClassDiscriminator); checkKind(actual.getDescriptor().getKind()); }  Intrinsics.checkNotNull(actual, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"); SerializationStrategy actualSerializer = isPolymorphicSerializer ? actual : serializer; if (baseClassDiscriminator != null) ifPolymorphic.invoke(baseClassDiscriminator, actualSerializer.getDescriptor().getSerialName());  actualSerializer.serialize((Encoder)$this$encodePolymorphically, value); } public static final <T> T decodeSerializableValuePolymorphic(@NotNull JsonDecoder $this$decodeSerializableValuePolymorphic, @NotNull DeserializationStrategy deserializer, @NotNull Function0 path) { DeserializationStrategy<? extends T> deserializationStrategy2; Intrinsics.checkNotNullParameter($this$decodeSerializableValuePolymorphic, "<this>"); Intrinsics.checkNotNullParameter(deserializer, "deserializer"); Intrinsics.checkNotNullParameter(path, "path"); int $i$f$decodeSerializableValuePolymorphic = 0; if (!(deserializer instanceof AbstractPolymorphicSerializer) || $this$decodeSerializableValuePolymorphic.getJson().getConfiguration().getUseArrayPolymorphism())
/* 111 */       return (T)deserializer.deserialize((Decoder)$this$decodeSerializableValuePolymorphic);  String discriminator = classDiscriminator(((AbstractPolymorphicSerializer)deserializer).getDescriptor(), $this$decodeSerializableValuePolymorphic.getJson()); JsonElement jsonElement = $this$decodeSerializableValuePolymorphic.decodeJsonElement(); String serialName$iv = ((AbstractPolymorphicSerializer)deserializer).getDescriptor().getSerialName(); int $i$f$cast = 0; if (!(jsonElement instanceof JsonObject)) {
/* 112 */       throw JsonExceptionsKt.JsonDecodingException(
/* 113 */           -1, 
/* 114 */           "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName() + " as the serialized body of " + serialName$iv + " at element: " + (String)path.invoke(), 
/* 115 */           (CharSequence)jsonElement.toString());
/*     */     }
/*     */     
/* 118 */     JsonObject jsonTree = (JsonObject)jsonElement;
/*     */     JsonElementKt.getJsonPrimitive((JsonElement)jsonTree.get(discriminator));
/*     */     String type = ((JsonElement)jsonTree.get(discriminator) != null && JsonElementKt.getJsonPrimitive((JsonElement)jsonTree.get(discriminator)) != null) ? JsonElementKt.getContentOrNull(JsonElementKt.getJsonPrimitive((JsonElement)jsonTree.get(discriminator))) : null;
/*     */     try {
/*     */       deserializationStrategy2 = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer)deserializer, (CompositeDecoder)$this$decodeSerializableValuePolymorphic, type);
/*     */     } catch (SerializationException it) {
/*     */       Intrinsics.checkNotNull(it.getMessage());
/*     */       throw JsonExceptionsKt.JsonDecodingException(-1, it.getMessage(), (CharSequence)jsonTree.toString());
/*     */     } 
/*     */     DeserializationStrategy<? extends T> deserializationStrategy1 = deserializationStrategy2;
/*     */     Intrinsics.checkNotNull(deserializationStrategy1, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
/*     */     DeserializationStrategy<? extends T> actualSerializer = deserializationStrategy1;
/*     */     return TreeJsonDecoderKt.readPolymorphicJson($this$decodeSerializableValuePolymorphic.getJson(), discriminator, jsonTree, actualSerializer); }
/*     */ 
/*     */   
/*     */   private static final void validateIfSealed(SerializationStrategy serializer, SerializationStrategy actualSerializer, String classDiscriminator) {
/*     */     if (!(serializer instanceof SealedClassSerializer))
/*     */       return; 
/*     */     if (JsonInternalDependenciesKt.jsonCachedSerialNames(actualSerializer.getDescriptor()).contains(classDiscriminator)) {
/*     */       String baseName = ((SealedClassSerializer)serializer).getDescriptor().getSerialName();
/*     */       String actualName = actualSerializer.getDescriptor().getSerialName();
/*     */       throw new IllegalStateException(("Sealed class '" + actualName + "' cannot be serialized as base class '" + baseName + "' because it has property name that conflicts with JSON class discriminator '" + classDiscriminator + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
/*     */     } 
/*     */   }
/*     */   
/*     */   public static final void checkKind(@NotNull SerialKind kind) {
/*     */     Intrinsics.checkNotNullParameter(kind, "kind");
/*     */     if (kind instanceof SerialKind.ENUM)
/*     */       throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString()); 
/*     */     if (kind instanceof kotlinx.serialization.descriptors.PrimitiveKind)
/*     */       throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString()); 
/*     */     if (kind instanceof kotlinx.serialization.descriptors.PolymorphicKind)
/*     */       throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString()); 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String classDiscriminator(@NotNull SerialDescriptor $this$classDiscriminator, @NotNull Json json) {
/*     */     Intrinsics.checkNotNullParameter($this$classDiscriminator, "<this>");
/*     */     Intrinsics.checkNotNullParameter(json, "json");
/*     */     for (Annotation annotation : $this$classDiscriminator.getAnnotations()) {
/*     */       if (annotation instanceof JsonClassDiscriminator)
/*     */         return ((JsonClassDiscriminator)annotation).discriminator(); 
/*     */     } 
/*     */     return json.getConfiguration().getClassDiscriminator();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Void throwJsonElementPolymorphicException(@Nullable String serialName, @NotNull JsonElement element) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     throw new JsonEncodingException("Class with serial name " + serialName + " cannot be serialized polymorphically because it is represented as " + Reflection.getOrCreateKotlinClass(element.getClass()).getSimpleName() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\PolymorphicKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */