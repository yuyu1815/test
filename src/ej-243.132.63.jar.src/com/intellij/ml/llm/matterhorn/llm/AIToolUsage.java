/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020$\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 &2\0020\001:\002%&B/\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\003\022\024\020\005\032\020\022\004\022\0020\003\022\004\022\0020\007\030\0010\006¢\006\004\b\b\020\tBE\b\020\022\006\020\n\032\0020\013\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\024\020\005\032\020\022\004\022\0020\003\022\004\022\0020\007\030\0010\006\022\b\020\f\032\004\030\0010\r¢\006\004\b\b\020\016J\013\020\024\032\004\030\0010\003HÆ\003J\t\020\025\032\0020\003HÆ\003J\027\020\026\032\020\022\004\022\0020\003\022\004\022\0020\007\030\0010\006HÆ\003J7\020\027\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\0032\026\b\002\020\005\032\020\022\004\022\0020\003\022\004\022\0020\007\030\0010\006HÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\013HÖ\001J\t\020\034\032\0020\003HÖ\001J%\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#H\001¢\006\002\b$R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\017\020\020R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\021\020\020R\037\020\005\032\020\022\004\022\0020\003\022\004\022\0020\007\030\0010\006¢\006\b\n\000\032\004\b\022\020\023¨\006'"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/AIToolUsage;", "", "toolId", "", "toolName", "toolParams", "", "Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getToolId", "()Ljava/lang/String;", "getToolName", "getToolParams", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class AIToolUsage {
/*    */   @NotNull
/* 22 */   public static final Companion Companion = new Companion(null); @Nullable private final String toolId; @NotNull private final String toolName; @Nullable private final Map<String, ParameterValue> toolParams; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = (KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)ParameterValue.$serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/AIToolUsage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/AIToolUsage;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AIToolUsage> serializer() { return (KSerializer<AIToolUsage>)AIToolUsage.$serializer.INSTANCE; }
/*    */      }
/* 24 */   public AIToolUsage(@Nullable String toolId, @NotNull String toolName, @Nullable Map<String, ParameterValue> toolParams) { this.toolId = toolId;
/* 25 */     this.toolName = toolName;
/* 26 */     this.toolParams = toolParams; } @Nullable public final String getToolId() { return this.toolId; } @Nullable public final Map<String, ParameterValue> getToolParams() { return this.toolParams; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getToolName() {
/*    */     return this.toolName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component1() {
/*    */     return this.toolId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.toolName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Map<String, ParameterValue> component3() {
/*    */     return this.toolParams;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AIToolUsage copy(@Nullable String toolId, @NotNull String toolName, @Nullable Map<String, ParameterValue> toolParams) {
/*    */     Intrinsics.checkNotNullParameter(toolName, "toolName");
/*    */     return new AIToolUsage(toolId, toolName, toolParams);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AIToolUsage(toolId=" + this.toolId + ", toolName=" + this.toolName + ", toolParams=" + this.toolParams + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.toolId == null) ? 0 : this.toolId.hashCode();
/*    */     result = result * 31 + this.toolName.hashCode();
/*    */     return result * 31 + ((this.toolParams == null) ? 0 : this.toolParams.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AIToolUsage))
/*    */       return false; 
/*    */     AIToolUsage aIToolUsage = (AIToolUsage)other;
/*    */     return !Intrinsics.areEqual(this.toolId, aIToolUsage.toolId) ? false : (!Intrinsics.areEqual(this.toolName, aIToolUsage.toolName) ? false : (!!Intrinsics.areEqual(this.toolParams, aIToolUsage.toolParams)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\AIToolUsage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */