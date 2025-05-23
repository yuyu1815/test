/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerializationException;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.SerializersKt;
/*     */ import kotlinx.serialization.descriptors.PolymorphicKind;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*     */ import kotlinx.serialization.descriptors.SerialKind;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\001\n\002\b\002\b&\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003B\025\022\f\020\004\032\b\022\004\022\0028\0000\005¢\006\004\b\006\020\007J\033\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0028\000¢\006\002\020\021J\023\020\022\032\0028\0002\006\020\023\032\0020\024¢\006\002\020\025J\026\020\026\032\b\022\004\022\0028\0000\0272\006\020\030\032\0020\031H$J \020\032\032\0020\0332\n\020\034\032\006\022\002\b\0030\0052\n\020\004\032\006\022\002\b\0030\005H\002R\024\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\002\n\000R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\n\020\013¨\006\035"}, d2 = {"Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "T", "", "Lkotlinx/serialization/KSerializer;", "baseClass", "Lkotlin/reflect/KClass;", "<init>", "(Lkotlin/reflect/KClass;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "throwSubtypeNotRegistered", "", "subClass", "kotlinx-serialization-json"})
/*     */ public abstract class JsonContentPolymorphicSerializer<T>
/*     */   implements KSerializer<T>
/*     */ {
/*     */   @NotNull
/*     */   private final KClass<T> baseClass;
/*     */   @NotNull
/*     */   private final SerialDescriptor descriptor;
/*     */   
/*     */   @NotNull
/*     */   public SerialDescriptor getDescriptor() {
/*     */     return this.descriptor;
/*     */   }
/*     */   
/*     */   public JsonContentPolymorphicSerializer(@NotNull KClass<T> baseClass) {
/*  67 */     this.baseClass = baseClass;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  77 */     this.descriptor = SerialDescriptorsKt.buildSerialDescriptor$default("JsonContentPolymorphicSerializer<" + this.baseClass.getSimpleName() + '>', (SerialKind)PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], null, 8, null);
/*     */   }
/*     */   public final void serialize(@NotNull Encoder encoder, @NotNull Object value) {
/*     */     SerializationStrategy actualSerializer;
/*  81 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); if (encoder.getSerializersModule().getPolymorphic(this.baseClass, value) == null) { encoder.getSerializersModule().getPolymorphic(this.baseClass, value);
/*  82 */       if (SerializersKt.serializerOrNull(Reflection.getOrCreateKotlinClass(value.getClass())) != null) {  } else { (SerializationStrategy)SerializersKt.serializerOrNull(Reflection.getOrCreateKotlinClass(value.getClass()));
/*  83 */         throwSubtypeNotRegistered(Reflection.getOrCreateKotlinClass(value.getClass()), this.baseClass); throw new KotlinNothingValueException(); }
/*     */        }
/*  85 */      ((KSerializer)actualSerializer).serialize(encoder, value);
/*     */   }
/*     */   @NotNull
/*     */   public final T deserialize(@NotNull Decoder decoder) {
/*  89 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); JsonDecoder input = JsonElementSerializersKt.asJsonDecoder(decoder);
/*  90 */     JsonElement tree = input.decodeJsonElement();
/*     */ 
/*     */     
/*  93 */     Intrinsics.checkNotNull(selectDeserializer(tree), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>"); KSerializer actualSerializer = (KSerializer)selectDeserializer(tree);
/*  94 */     return input.getJson().decodeFromJsonElement((DeserializationStrategy<? extends T>)actualSerializer, tree);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   protected abstract DeserializationStrategy<T> selectDeserializer(@NotNull JsonElement paramJsonElement);
/*     */ 
/*     */   
/*     */   private final Void throwSubtypeNotRegistered(KClass subClass, KClass baseClass) {
/* 103 */     if (subClass.getSimpleName() == null) subClass.getSimpleName();  String subClassName = String.valueOf(subClass);
/* 104 */     String scope = "in the scope of '" + baseClass.getSimpleName() + '\'';
/* 105 */     throw new SerializationException(
/* 106 */         "Class '" + subClassName + "' is not registered for polymorphic serialization " + scope + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonContentPolymorphicSerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */