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
/*     */ import kotlinx.serialization.internal.BooleanSerializer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\022\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 )2\0020\001:\002()B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\006\020\007\032\0020\b¢\006\004\b\t\020\nBA\b\020\022\006\020\013\032\0020\f\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\003\022\006\020\007\032\0020\b\022\b\020\r\032\004\030\0010\016¢\006\004\b\t\020\017J\b\020\027\032\0020\003H\026J\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\005HÆ\003J\t\020\032\032\0020\003HÆ\003J\t\020\033\032\0020\bHÆ\003J1\020\034\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\bHÆ\001J\023\020\035\032\0020\b2\b\020\036\032\004\030\0010\001HÖ\003J\t\020\037\032\0020\fHÖ\001J%\020 \032\0020!2\006\020\"\032\0020\0002\006\020#\032\0020$2\006\020%\032\0020&H\001¢\006\002\b'R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\024\020\021R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\025\020\026¨\006*"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolParam;", "", "name", "", "type", "Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;", "description", "required", "", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;", "getDescription", "getRequired", "()Z", "toString", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class MatterhornToolParam
/*     */ {
/*     */   @NotNull
/* 187 */   public static final Companion Companion = new Companion(null); @NotNull private final String name; @NotNull private final ArgumentType type; @NotNull private final String description; private final boolean required; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.llm.ArgumentType", (Enum[])ArgumentType.values()); arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolParam$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolParam;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<MatterhornToolParam> serializer() { return (KSerializer<MatterhornToolParam>)MatterhornToolParam.$serializer.INSTANCE; }
/*     */      }
/* 189 */   public MatterhornToolParam(@NotNull String name, @NotNull ArgumentType type, @NotNull String description, boolean required) { this.name = name;
/* 190 */     this.type = type;
/* 191 */     this.description = description;
/* 192 */     this.required = required; } @NotNull public final String getName() { return this.name; } public final boolean getRequired() { return this.required; }
/*     */   @NotNull public final ArgumentType getType() { return this.type; }
/*     */   @NotNull public final String getDescription() { return this.description; } @NotNull
/* 195 */   public String toString() { return "name: \"" + this.name + "\" type: \"" + this.type + "\" description: \"" + this.description + "\" required: " + this.required; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArgumentType component2() {
/*     */     return this.type;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component3() {
/*     */     return this.description;
/*     */   }
/*     */   
/*     */   public final boolean component4() {
/*     */     return this.required;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornToolParam copy(@NotNull String name, @NotNull ArgumentType type, @NotNull String description, boolean required) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     Intrinsics.checkNotNullParameter(description, "description");
/*     */     return new MatterhornToolParam(name, type, description, required);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.name.hashCode();
/*     */     result = result * 31 + this.type.hashCode();
/*     */     result = result * 31 + this.description.hashCode();
/*     */     return result * 31 + Boolean.hashCode(this.required);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MatterhornToolParam))
/*     */       return false; 
/*     */     MatterhornToolParam matterhornToolParam = (MatterhornToolParam)other;
/*     */     return !Intrinsics.areEqual(this.name, matterhornToolParam.name) ? false : ((this.type != matterhornToolParam.type) ? false : (!Intrinsics.areEqual(this.description, matterhornToolParam.description) ? false : (!(this.required != matterhornToolParam.required))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornToolParam.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */