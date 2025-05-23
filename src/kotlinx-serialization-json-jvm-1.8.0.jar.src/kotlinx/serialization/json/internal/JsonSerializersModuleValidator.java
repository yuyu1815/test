/*    */ package kotlinx.serialization.json.internal;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.descriptors.SerialKind;
/*    */ import kotlinx.serialization.descriptors.StructureKind;
/*    */ import kotlinx.serialization.json.ClassDiscriminatorMode;
/*    */ import kotlinx.serialization.json.JsonConfiguration;
/*    */ import kotlinx.serialization.modules.SerializersModuleCollector;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\020\013\n\002\b\002\n\002\020\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005JQ\020\013\032\0020\f\"\b\b\000\020\r*\0020\0162\f\020\017\032\b\022\004\022\002H\r0\0202/\020\021\032+\022\035\022\033\022\b\022\006\022\002\b\0030\0240\023¢\006\f\b\025\022\b\b\026\022\004\b\b(\027\022\b\022\006\022\002\b\0030\0240\022H\026JF\020\030\032\0020\f\"\b\b\000\020\031*\0020\016\"\b\b\001\020\032*\002H\0312\f\020\033\032\b\022\004\022\002H\0310\0202\f\020\034\032\b\022\004\022\002H\0320\0202\f\020\035\032\b\022\004\022\002H\0320\024H\026J\034\020\036\032\0020\f2\006\020\037\032\0020 2\n\020\034\032\006\022\002\b\0030\020H\002J\034\020!\032\0020\f2\006\020\037\032\0020 2\n\020\034\032\006\022\002\b\0030\020H\002JK\020\"\032\0020\f\"\b\b\000\020\031*\0020\0162\f\020\033\032\b\022\004\022\002H\0310\0202)\020#\032%\022\023\022\021H\031¢\006\f\b\025\022\b\b\026\022\004\b\b($\022\f\022\n\022\004\022\002H\031\030\0010%0\022H\026JM\020&\032\0020\f\"\b\b\000\020\031*\0020\0162\f\020\033\032\b\022\004\022\002H\0310\0202+\020'\032'\022\025\022\023\030\0010\007¢\006\f\b\025\022\b\b\026\022\004\b\b((\022\f\022\n\022\004\022\002H\031\030\0010)0\022H\026R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\tX\004¢\006\002\n\000¨\006*"}, d2 = {"Lkotlinx/serialization/json/internal/JsonSerializersModuleValidator;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;)V", "discriminator", "", "useArrayPolymorphism", "", "isDiscriminatorRequired", "contextual", "", "T", "", "kClass", "Lkotlin/reflect/KClass;", "provider", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "polymorphic", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "checkKind", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "checkDiscriminatorCollisions", "polymorphicDefaultSerializer", "defaultSerializerProvider", "value", "Lkotlinx/serialization/SerializationStrategy;", "polymorphicDefaultDeserializer", "defaultDeserializerProvider", "className", "Lkotlinx/serialization/DeserializationStrategy;", "kotlinx-serialization-json"})
/*    */ public final class JsonSerializersModuleValidator implements SerializersModuleCollector {
/*    */   public JsonSerializersModuleValidator(@NotNull JsonConfiguration configuration) {
/* 18 */     this.discriminator = configuration.getClassDiscriminator();
/* 19 */     this.useArrayPolymorphism = configuration.getUseArrayPolymorphism();
/* 20 */     this.isDiscriminatorRequired = (configuration.getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final String discriminator;
/*    */   
/*    */   public <T> void contextual(@NotNull KClass kClass, @NotNull Function1 provider) {
/* 27 */     Intrinsics.checkNotNullParameter(kClass, "kClass"); Intrinsics.checkNotNullParameter(provider, "provider");
/*    */   }
/*    */   
/*    */   private final boolean useArrayPolymorphism;
/*    */   private final boolean isDiscriminatorRequired;
/*    */   
/*    */   public <Base, Sub extends Base> void polymorphic(@NotNull KClass baseClass, @NotNull KClass<?> actualClass, @NotNull KSerializer actualSerializer) {
/* 34 */     Intrinsics.checkNotNullParameter(baseClass, "baseClass"); Intrinsics.checkNotNullParameter(actualClass, "actualClass"); Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer"); SerialDescriptor descriptor = actualSerializer.getDescriptor();
/* 35 */     checkKind(descriptor, actualClass);
/* 36 */     if (!this.useArrayPolymorphism && this.isDiscriminatorRequired)
/*    */     {
/* 38 */       checkDiscriminatorCollisions(descriptor, actualClass);
/*    */     }
/*    */   }
/*    */   
/*    */   private final void checkKind(SerialDescriptor descriptor, KClass actualClass) {
/* 43 */     SerialKind kind = descriptor.getKind();
/* 44 */     if (kind instanceof kotlinx.serialization.descriptors.PolymorphicKind || Intrinsics.areEqual(kind, SerialKind.CONTEXTUAL.INSTANCE)) {
/* 45 */       throw new IllegalArgumentException("Serializer for " + actualClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + 
/* 46 */           kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
/*    */     }
/*    */     
/* 49 */     if (this.useArrayPolymorphism)
/* 50 */       return;  if (!this.isDiscriminatorRequired) {
/*    */       return;
/*    */     }
/*    */ 
/*    */     
/* 55 */     if (Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE) || Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE) || 
/* 56 */       kind instanceof kotlinx.serialization.descriptors.PrimitiveKind || 
/* 57 */       kind instanceof SerialKind.ENUM)
/*    */     {
/* 59 */       throw new IllegalArgumentException(
/* 60 */           "Serializer for " + actualClass.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final void checkDiscriminatorCollisions(SerialDescriptor descriptor, KClass actualClass) {
/* 69 */     for (int i = 0, j = descriptor.getElementsCount(); i < j; i++) {
/* 70 */       String name = descriptor.getElementName(i);
/* 71 */       if (Intrinsics.areEqual(name, this.discriminator)) {
/* 72 */         throw new IllegalArgumentException(
/* 73 */             "Polymorphic serializer for " + actualClass + " has property '" + name + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public <Base> void polymorphicDefaultSerializer(@NotNull KClass baseClass, @NotNull Function1 defaultSerializerProvider) {
/* 87 */     Intrinsics.checkNotNullParameter(baseClass, "baseClass"); Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public <Base> void polymorphicDefaultDeserializer(@NotNull KClass baseClass, @NotNull Function1 defaultDeserializerProvider) {
/* 94 */     Intrinsics.checkNotNullParameter(baseClass, "baseClass"); Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonSerializersModuleValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */