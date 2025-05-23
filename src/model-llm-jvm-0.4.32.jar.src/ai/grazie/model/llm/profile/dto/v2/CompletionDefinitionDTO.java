/*    */ package ai.grazie.model.llm.profile.dto.v2;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.Arrays;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.UnknownFieldException;
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
/*    */ @Deprecated(message = "In favor of ai.grazie.model.llm.profile.dto.v3.CompletionDefinitionDTO")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000  2\0020\001:\002\037 B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\024\020\016\032\b\022\004\022\0020\0060\005HÆ\003¢\006\002\020\fJ\036\020\017\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001¢\006\002\020\020J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\003HÖ\001J\t\020\025\032\0020\026HÖ\001J&\020\027\032\0020\0302\006\020\031\032\0020\0002\006\020\032\032\0020\0332\006\020\034\032\0020\035HÁ\001¢\006\002\b\036R\031\020\004\032\b\022\004\022\0020\0060\005¢\006\n\n\002\020\r\032\004\b\013\020\f¨\006!"}, d2 = {"Lai/grazie/model/llm/profile/dto/v2/CompletionDefinitionDTO;", "", "seen1", "", "parameters", "", "Lai/grazie/utils/attributes/Attributes$Key;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[Lai/grazie/utils/attributes/Attributes$Key;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([Lai/grazie/utils/attributes/Attributes$Key;)V", "getParameters", "()[Lai/grazie/utils/attributes/Attributes$Key;", "[Lai/grazie/utils/attributes/Attributes$Key;", "component1", "copy", "([Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/model/llm/profile/dto/v2/CompletionDefinitionDTO;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_llm", "$serializer", "Companion", "model-llm"})
/*    */ public final class CompletionDefinitionDTO {
/*    */   @NotNull
/* 31 */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final Attributes.Key[] parameters; @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers;
/* 35 */   public CompletionDefinitionDTO(@NotNull Attributes.Key[] parameters) { this.parameters = parameters; } @NotNull public final Attributes.Key[] getParameters() { return this.parameters; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */     arrayOfKSerializer[0] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Attributes.Key.class), Attributes.Key.Companion.serializer());
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/profile/dto/v2/CompletionDefinitionDTO.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/profile/dto/v2/CompletionDefinitionDTO;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"})
/*    */   public static final class $serializer implements GeneratedSerializer<CompletionDefinitionDTO> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])CompletionDefinitionDTO.$childSerializers, arrayOfKSerializer2 = new KSerializer[1];
/*    */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public CompletionDefinitionDTO deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Attributes.Key[] arrayOfKey = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])CompletionDefinitionDTO.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         arrayOfKey = (Attributes.Key[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfKey);
/*    */         i |= 0x1;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               arrayOfKey = (Attributes.Key[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfKey);
/*    */               i |= 0x1;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new CompletionDefinitionDTO(i, arrayOfKey, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull CompletionDefinitionDTO value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       CompletionDefinitionDTO.write$Self$model_llm(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.llm.profile.dto.v2.CompletionDefinitionDTO", INSTANCE, 1);
/*    */       pluginGeneratedSerialDescriptor.addElement("parameters", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/llm/profile/dto/v2/CompletionDefinitionDTO$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/profile/dto/v2/CompletionDefinitionDTO;", "model-llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<CompletionDefinitionDTO> serializer() {
/*    */       return (KSerializer<CompletionDefinitionDTO>)CompletionDefinitionDTO.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Attributes.Key[] component1() {
/*    */     return this.parameters;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CompletionDefinitionDTO copy(@NotNull Attributes.Key[] parameters) {
/*    */     Intrinsics.checkNotNullParameter(parameters, "parameters");
/*    */     return new CompletionDefinitionDTO(parameters);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CompletionDefinitionDTO(parameters=" + Arrays.toString((Object[])this.parameters) + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return Arrays.hashCode((Object[])this.parameters);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CompletionDefinitionDTO))
/*    */       return false; 
/*    */     CompletionDefinitionDTO completionDefinitionDTO = (CompletionDefinitionDTO)other;
/*    */     return !!Intrinsics.areEqual(this.parameters, completionDefinitionDTO.parameters);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\dto\v2\CompletionDefinitionDTO.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */