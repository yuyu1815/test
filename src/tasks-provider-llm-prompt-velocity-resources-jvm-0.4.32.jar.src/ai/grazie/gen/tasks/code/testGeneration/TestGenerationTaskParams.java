/*    */ package ai.grazie.gen.tasks.code.testGeneration;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\021\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\0020\001:\002*+B=\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\007\022\n\b\001\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB%\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\t¢\006\002\020\rJ\t\020\030\032\0020\005HÆ\003J\013\020\031\032\004\030\0010\007HÆ\003J\013\020\032\032\004\030\0010\tHÆ\003J+\020\033\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\tHÆ\001J\023\020\034\032\0020\0352\b\020\036\032\004\030\0010\001HÖ\003J\t\020\037\032\0020\003HÖ\001J\t\020 \032\0020!HÖ\001J&\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(HÁ\001¢\006\002\b)R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021R\036\020\006\032\004\030\0010\0078\006X\004¢\006\016\n\000\022\004\b\022\020\017\032\004\b\023\020\024R\036\020\b\032\004\030\0010\t8\006X\004¢\006\016\n\000\022\004\b\025\020\017\032\004\b\026\020\027¨\006,"}, d2 = {"Lai/grazie/gen/tasks/code/testGeneration/TestGenerationTaskParams;", "", "seen1", "", "context", "Lai/grazie/gen/tasks/code/testGeneration/TestGenerationContext;", "previousTestSuite", "Lai/grazie/gen/tasks/code/testGeneration/TestSuite;", "userRequest", "Lai/grazie/gen/tasks/code/testGeneration/UserRequest;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gen/tasks/code/testGeneration/TestGenerationContext;Lai/grazie/gen/tasks/code/testGeneration/TestSuite;Lai/grazie/gen/tasks/code/testGeneration/UserRequest;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/gen/tasks/code/testGeneration/TestGenerationContext;Lai/grazie/gen/tasks/code/testGeneration/TestSuite;Lai/grazie/gen/tasks/code/testGeneration/UserRequest;)V", "getContext$annotations", "()V", "getContext", "()Lai/grazie/gen/tasks/code/testGeneration/TestGenerationContext;", "getPreviousTestSuite$annotations", "getPreviousTestSuite", "()Lai/grazie/gen/tasks/code/testGeneration/TestSuite;", "getUserRequest$annotations", "getUserRequest", "()Lai/grazie/gen/tasks/code/testGeneration/UserRequest;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class TestGenerationTaskParams {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final TestGenerationContext context;
/*    */   @Nullable
/*    */   private final TestSuite previousTestSuite;
/*    */   @Nullable
/*    */   private final UserRequest userRequest;
/*    */   
/* 38 */   public TestGenerationTaskParams(@NotNull TestGenerationContext context, @Nullable TestSuite previousTestSuite, @Nullable UserRequest userRequest) { this.context = context;
/*    */ 
/*    */     
/* 41 */     this.previousTestSuite = previousTestSuite;
/*    */ 
/*    */     
/* 44 */     this.userRequest = userRequest; } @Nullable
/* 45 */   public final UserRequest getUserRequest() { return this.userRequest; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/code/testGeneration/TestGenerationTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/code/testGeneration/TestGenerationTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<TestGenerationTaskParams> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */       arrayOfKSerializer[0] = (KSerializer)TestGenerationContext.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)TestSuite.$serializer.INSTANCE);
/*    */       arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)UserRequest.$serializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public TestGenerationTaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       TestGenerationContext testGenerationContext = null;
/*    */       TestSuite testSuite = null;
/*    */       UserRequest userRequest = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         testGenerationContext = (TestGenerationContext)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TestGenerationContext.$serializer.INSTANCE, testGenerationContext);
/*    */         i |= 0x1;
/*    */         testSuite = (TestSuite)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TestSuite.$serializer.INSTANCE, testSuite);
/*    */         i |= 0x2;
/*    */         userRequest = (UserRequest)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)UserRequest.$serializer.INSTANCE, userRequest);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               testGenerationContext = (TestGenerationContext)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TestGenerationContext.$serializer.INSTANCE, testGenerationContext);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               testSuite = (TestSuite)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TestSuite.$serializer.INSTANCE, testSuite);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               userRequest = (UserRequest)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)UserRequest.$serializer.INSTANCE, userRequest);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new TestGenerationTaskParams(i, testGenerationContext, testSuite, userRequest, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull TestGenerationTaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       TestGenerationTaskParams.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.code.testGeneration.TestGenerationTaskParams", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("context", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("previousTestSuite", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("userRequest", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/testGeneration/TestGenerationTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/testGeneration/TestGenerationTaskParams;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<TestGenerationTaskParams> serializer() {
/*    */       return (KSerializer<TestGenerationTaskParams>)TestGenerationTaskParams.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TestGenerationContext getContext() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final TestSuite getPreviousTestSuite() {
/*    */     return this.previousTestSuite;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TestGenerationContext component1() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final TestSuite component2() {
/*    */     return this.previousTestSuite;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final UserRequest component3() {
/*    */     return this.userRequest;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TestGenerationTaskParams copy(@NotNull TestGenerationContext context, @Nullable TestSuite previousTestSuite, @Nullable UserRequest userRequest) {
/*    */     Intrinsics.checkNotNullParameter(context, "context");
/*    */     return new TestGenerationTaskParams(context, previousTestSuite, userRequest);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TestGenerationTaskParams(context=" + this.context + ", previousTestSuite=" + this.previousTestSuite + ", userRequest=" + this.userRequest + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.context.hashCode();
/*    */     result = result * 31 + ((this.previousTestSuite == null) ? 0 : this.previousTestSuite.hashCode());
/*    */     return result * 31 + ((this.userRequest == null) ? 0 : this.userRequest.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TestGenerationTaskParams))
/*    */       return false; 
/*    */     TestGenerationTaskParams testGenerationTaskParams = (TestGenerationTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.context, testGenerationTaskParams.context) ? false : (!Intrinsics.areEqual(this.previousTestSuite, testGenerationTaskParams.previousTestSuite) ? false : (!!Intrinsics.areEqual(this.userRequest, testGenerationTaskParams.userRequest)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\code\testGeneration\TestGenerationTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */