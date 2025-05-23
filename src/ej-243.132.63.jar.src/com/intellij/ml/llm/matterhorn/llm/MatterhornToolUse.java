/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import java.util.Map;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
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
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.LinkedHashMapSerializer;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020$\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 &2\0020\001:\002%&B+\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\022\020\005\032\016\022\004\022\0020\003\022\004\022\0020\0070\006¢\006\004\b\b\020\tBE\b\020\022\006\020\n\032\0020\013\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\024\020\005\032\020\022\004\022\0020\003\022\004\022\0020\007\030\0010\006\022\b\020\f\032\004\030\0010\r¢\006\004\b\b\020\016J\b\020\024\032\0020\003H\026J\t\020\025\032\0020\003HÆ\003J\t\020\026\032\0020\003HÆ\003J\025\020\027\032\016\022\004\022\0020\003\022\004\022\0020\0070\006HÆ\003J3\020\030\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\024\b\002\020\005\032\016\022\004\022\0020\003\022\004\022\0020\0070\006HÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\001HÖ\003J\t\020\034\032\0020\013HÖ\001J%\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#H\001¢\006\002\b$R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\017\020\020R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\021\020\020R\035\020\005\032\016\022\004\022\0020\003\022\004\022\0020\0070\006¢\006\b\n\000\032\004\b\022\020\023¨\006'"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolUse;", "", "id", "", "name", "input", "", "Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getName", "getInput", "()Ljava/util/Map;", "toString", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class MatterhornToolUse
/*     */ {
/*     */   @NotNull
/*     */   private final String id;
/*     */   @NotNull
/*     */   private final String name;
/*     */   @NotNull
/* 137 */   public static final Companion Companion = new Companion(null); @NotNull private final Map<String, ParameterValue> input; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = (KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)ParameterValue.$serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolUse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolUse;", "core"}) public static final class Companion { @NotNull public final KSerializer<MatterhornToolUse> serializer() { return (KSerializer<MatterhornToolUse>)MatterhornToolUse.$serializer.INSTANCE; } private Companion() {} } public MatterhornToolUse(@NotNull String id, @NotNull String name, @NotNull Map<String, ParameterValue> input) {
/* 138 */     this.id = id; this.name = name; this.input = input; } @NotNull public final String getId() { return this.id; } @NotNull public final String getName() { return this.name; } @NotNull public final Map<String, ParameterValue> getInput() { return this.input; }
/*     */   @NotNull
/* 140 */   public String toString() { return "id: \"" + this.id + "\" name: \"" + this.name + "\" " + CollectionsKt.joinToString$default(MapsKt.toList(this.input), ", ", "[", "]", 0, null, MatterhornToolUse::toString$lambda$0, 24, null); } private static final CharSequence toString$lambda$0(Pair it) { Intrinsics.checkNotNullParameter(it, "it"); return "" + it.getFirst() + "=" + it.getFirst(); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.id;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Map<String, ParameterValue> component3() {
/*     */     return this.input;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornToolUse copy(@NotNull String id, @NotNull String name, @NotNull Map<String, ParameterValue> input) {
/*     */     Intrinsics.checkNotNullParameter(id, "id");
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     Intrinsics.checkNotNullParameter(input, "input");
/*     */     return new MatterhornToolUse(id, name, input);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.id.hashCode();
/*     */     result = result * 31 + this.name.hashCode();
/*     */     return result * 31 + this.input.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MatterhornToolUse))
/*     */       return false; 
/*     */     MatterhornToolUse matterhornToolUse = (MatterhornToolUse)other;
/*     */     return !Intrinsics.areEqual(this.id, matterhornToolUse.id) ? false : (!Intrinsics.areEqual(this.name, matterhornToolUse.name) ? false : (!!Intrinsics.areEqual(this.input, matterhornToolUse.input)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornToolUse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */