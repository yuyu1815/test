/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.LinkedHashMapSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020$\n\002\030\002\n\000\n\002\020 \n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 ,2\0020\001:\002+,B1\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0060\005\022\f\020\007\032\b\022\004\022\0020\0030\b¢\006\004\b\t\020\nBK\b\020\022\006\020\013\032\0020\f\022\b\020\002\032\004\030\0010\003\022\024\020\004\032\020\022\004\022\0020\003\022\004\022\0020\006\030\0010\005\022\016\020\007\032\n\022\004\022\0020\003\030\0010\b\022\b\020\r\032\004\030\0010\016¢\006\004\b\t\020\017J\t\020\032\032\0020\003HÆ\003J\025\020\033\032\016\022\004\022\0020\003\022\004\022\0020\0060\005HÆ\003J\017\020\034\032\b\022\004\022\0020\0030\bHÆ\003J9\020\035\032\0020\0002\b\b\002\020\002\032\0020\0032\024\b\002\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0060\0052\016\b\002\020\007\032\b\022\004\022\0020\0030\bHÆ\001J\023\020\036\032\0020\0372\b\020 \032\004\030\0010\001HÖ\003J\t\020!\032\0020\fHÖ\001J\t\020\"\032\0020\003HÖ\001J%\020#\032\0020$2\006\020%\032\0020\0002\006\020&\032\0020'2\006\020(\032\0020)H\001¢\006\002\b*R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\020\020\021\032\004\b\022\020\023R(\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0060\0058\006X\004¢\006\016\n\000\022\004\b\024\020\021\032\004\b\025\020\026R\"\020\007\032\b\022\004\022\0020\0030\b8\006X\004¢\006\016\n\000\022\004\b\027\020\021\032\004\b\030\020\031¨\006-"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicInputSchema;", "", "type", "", "properties", "", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicInputSchemaProperty;", "required", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "getProperties$annotations", "getProperties", "()Ljava/util/Map;", "getRequired$annotations", "getRequired", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AnthropicInputSchema
/*    */ {
/*    */   @NotNull
/*    */   private final String type;
/*    */   @NotNull
/*    */   private final Map<String, AnthropicInputSchemaProperty> properties;
/*    */   @NotNull
/* 52 */   public static final Companion Companion = new Companion(null); @NotNull private final List<String> required; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = (KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)AnthropicInputSchemaProperty.$serializer.INSTANCE); arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicInputSchema$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicInputSchema;", "core-llm"}) public static final class Companion { @NotNull public final KSerializer<AnthropicInputSchema> serializer() { return (KSerializer<AnthropicInputSchema>)AnthropicInputSchema.$serializer.INSTANCE; }
/*    */      private Companion() {} } public AnthropicInputSchema(@NotNull String type, @NotNull Map<String, AnthropicInputSchemaProperty> properties, @NotNull List<String> required) {
/* 54 */     this.type = type;
/*    */ 
/*    */     
/* 57 */     this.properties = properties;
/*    */ 
/*    */     
/* 60 */     this.required = required; } @NotNull public final List<String> getRequired() { return this.required; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getType() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Map<String, AnthropicInputSchemaProperty> getProperties() {
/*    */     return this.properties;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Map<String, AnthropicInputSchemaProperty> component2() {
/*    */     return this.properties;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component3() {
/*    */     return this.required;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnthropicInputSchema copy(@NotNull String type, @NotNull Map<String, AnthropicInputSchemaProperty> properties, @NotNull List<String> required) {
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     Intrinsics.checkNotNullParameter(properties, "properties");
/*    */     Intrinsics.checkNotNullParameter(required, "required");
/*    */     return new AnthropicInputSchema(type, properties, required);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AnthropicInputSchema(type=" + this.type + ", properties=" + this.properties + ", required=" + this.required + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.type.hashCode();
/*    */     result = result * 31 + this.properties.hashCode();
/*    */     return result * 31 + this.required.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AnthropicInputSchema))
/*    */       return false; 
/*    */     AnthropicInputSchema anthropicInputSchema = (AnthropicInputSchema)other;
/*    */     return !Intrinsics.areEqual(this.type, anthropicInputSchema.type) ? false : (!Intrinsics.areEqual(this.properties, anthropicInputSchema.properties) ? false : (!!Intrinsics.areEqual(this.required, anthropicInputSchema.required)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicInputSchema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */