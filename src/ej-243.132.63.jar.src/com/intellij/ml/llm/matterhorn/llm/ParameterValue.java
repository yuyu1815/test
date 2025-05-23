/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.EnumsKt;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B\021\b\026\022\006\020\004\032\0020\b¢\006\004\b\006\020\tB\021\b\026\022\006\020\004\032\0020\005¢\006\004\b\006\020\nB/\b\020\022\006\020\013\032\0020\b\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\f\032\004\030\0010\r¢\006\004\b\006\020\016J\b\020\023\032\0020\005H\026J\t\020\024\032\0020\003HÆ\003J\t\020\025\032\0020\005HÆ\003J\035\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\bHÖ\001J%\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!H\001¢\006\002\b\"R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\017\020\020R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\021\020\022¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;", "", "type", "Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;", "value", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;Ljava/lang/String;)V", "", "(I)V", "(Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/llm/ArgumentType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;", "getValue", "()Ljava/lang/String;", "toString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class ParameterValue
/*     */ {
/*     */   @NotNull
/*     */   private final ArgumentType type;
/*     */   @NotNull
/*     */   private final String value;
/*     */   @NotNull
/* 123 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.llm.ArgumentType", (Enum[])ArgumentType.values()); arrayOfKSerializer[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;", "core"}) public static final class Companion { @NotNull public final KSerializer<ParameterValue> serializer() { return (KSerializer<ParameterValue>)ParameterValue.$serializer.INSTANCE; } private Companion() {} } public ParameterValue(@NotNull ArgumentType type, @NotNull String value) {
/* 124 */     this.type = type; this.value = value; } @NotNull public final ArgumentType getType() { return this.type; } @NotNull public final String getValue() { return this.value; }
/* 125 */   public ParameterValue(int value) { this(ArgumentType.INTEGER, String.valueOf(value)); } public ParameterValue(@NotNull String value) {
/* 126 */     this(ArgumentType.STRING, value);
/*     */   } @NotNull
/*     */   public String toString() {
/* 129 */     return "type: \"" + this.type + "\" value: \"" + this.value + "\"";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArgumentType component1() {
/*     */     return this.type;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.value;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ParameterValue copy(@NotNull ArgumentType type, @NotNull String value) {
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     return new ParameterValue(type, value);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.type.hashCode();
/*     */     return result * 31 + this.value.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ParameterValue))
/*     */       return false; 
/*     */     ParameterValue parameterValue = (ParameterValue)other;
/*     */     return (this.type != parameterValue.type) ? false : (!!Intrinsics.areEqual(this.value, parameterValue.value));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\ParameterValue.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */