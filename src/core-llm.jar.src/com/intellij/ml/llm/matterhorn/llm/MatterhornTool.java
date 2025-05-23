/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\021\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 /2\0020\001:\002./BQ\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003\022\n\b\002\020\005\032\004\030\0010\003\022\020\b\002\020\006\032\n\022\004\022\0020\b\030\0010\007\022\026\b\002\020\t\032\020\022\004\022\0020\003\022\004\022\0020\013\030\0010\n¢\006\004\b\f\020\rB_\b\020\022\006\020\016\032\0020\017\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\003\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\024\020\t\032\020\022\004\022\0020\003\022\004\022\0020\013\030\0010\n\022\b\020\020\032\004\030\0010\021¢\006\004\b\f\020\022J\b\020\033\032\0020\003H\026J\t\020\034\032\0020\003HÆ\003J\013\020\035\032\004\030\0010\003HÆ\003J\013\020\036\032\004\030\0010\003HÆ\003J\021\020\037\032\n\022\004\022\0020\b\030\0010\007HÆ\003J\027\020 \032\020\022\004\022\0020\003\022\004\022\0020\013\030\0010\nHÆ\003JU\020!\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0032\n\b\002\020\005\032\004\030\0010\0032\020\b\002\020\006\032\n\022\004\022\0020\b\030\0010\0072\026\b\002\020\t\032\020\022\004\022\0020\003\022\004\022\0020\013\030\0010\nHÆ\001J\023\020\"\032\0020#2\b\020$\032\004\030\0010\001HÖ\003J\t\020%\032\0020\017HÖ\001J%\020&\032\0020'2\006\020(\032\0020\0002\006\020)\032\0020*2\006\020+\032\0020,H\001¢\006\002\b-R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\023\020\024R\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\025\020\024R\023\020\005\032\004\030\0010\003¢\006\b\n\000\032\004\b\026\020\024R\031\020\006\032\n\022\004\022\0020\b\030\0010\007¢\006\b\n\000\032\004\b\027\020\030R\037\020\t\032\020\022\004\022\0020\003\022\004\022\0020\013\030\0010\n¢\006\b\n\000\032\004\b\031\020\032¨\0060"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;", "", "name", "", "type", "description", "params", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolParam;", "settings", "", "Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getType", "getDescription", "getParams", "()Ljava/util/List;", "getSettings", "()Ljava/util/Map;", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class MatterhornTool
/*     */ {
/*     */   @NotNull
/* 199 */   public static final Companion Companion = new Companion(null); @NotNull private final String name; @Nullable private final String type; @Nullable private final String description; @Nullable private final List<MatterhornToolParam> params; @Nullable private final Map<String, ParameterValue> settings; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = (KSerializer)new ArrayListSerializer((KSerializer)MatterhornToolParam.$serializer.INSTANCE); arrayOfKSerializer[4] = (KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)ParameterValue.$serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<MatterhornTool> serializer() { return (KSerializer<MatterhornTool>)MatterhornTool.$serializer.INSTANCE; }
/*     */      }
/* 201 */   public MatterhornTool(@NotNull String name, @Nullable String type, @Nullable String description, @Nullable List<MatterhornToolParam> params, @Nullable Map<String, ParameterValue> settings) { this.name = name;
/* 202 */     this.type = type;
/* 203 */     this.description = description;
/* 204 */     this.params = params;
/*     */ 
/*     */     
/* 207 */     this.settings = settings; } @NotNull public final String getName() { return this.name; } @Nullable public final String getType() { return this.type; } @Nullable public final Map<String, ParameterValue> getSettings() { return this.settings; }
/*     */   @Nullable public final String getDescription() { return this.description; }
/*     */   @Nullable public final List<MatterhornToolParam> getParams() { return this.params; } @NotNull
/* 210 */   public String toString() { List<MatterhornToolParam> list = this.params; String paramString = ((list == null || list.isEmpty())) ? null : CollectionsKt.joinToString$default(this.params, ",\n", "[", "]", 0, null, MatterhornTool::toString$lambda$0, 24, null);
/* 211 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$toString_u24lambda_u242 = stringBuilder1; int $i$a$-buildString-MatterhornTool$toString$1 = 0;
/* 212 */     $this$toString_u24lambda_u242.append("tool name: \"" + this.name + "\"");
/* 213 */     if (this.type != null) $this$toString_u24lambda_u242.append("\ntype: \"" + this.type + "\""); 
/* 214 */     if (paramString != null) $this$toString_u24lambda_u242.append("\nparams: " + paramString); 
/* 215 */     if (this.description != null) $this$toString_u24lambda_u242.append("\ndescription: \"" + StringsKt.trim(this.description).toString() + "\""); 
/* 216 */     if (this.settings != null) $this$toString_u24lambda_u242.append(CollectionsKt.joinToString$default(this.settings.entrySet(), ", ", "\nsettings: {", "}", 0, null, MatterhornTool::toString$lambda$2$lambda$1, 24, null));  Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)"); return stringBuilder1.toString(); } private static final CharSequence toString$lambda$0(MatterhornToolParam it) { Intrinsics.checkNotNullParameter(it, "it"); return it.toString(); } private static final CharSequence toString$lambda$2$lambda$1(Map.Entry it) { Intrinsics.checkNotNullParameter(it, "it"); return "\"" + it.getKey() + "\": {" + it.getValue() + "}"; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component2() {
/*     */     return this.type;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component3() {
/*     */     return this.description;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final List<MatterhornToolParam> component4() {
/*     */     return this.params;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Map<String, ParameterValue> component5() {
/*     */     return this.settings;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornTool copy(@NotNull String name, @Nullable String type, @Nullable String description, @Nullable List<MatterhornToolParam> params, @Nullable Map<String, ParameterValue> settings) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     return new MatterhornTool(name, type, description, params, settings);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.name.hashCode();
/*     */     result = result * 31 + ((this.type == null) ? 0 : this.type.hashCode());
/*     */     result = result * 31 + ((this.description == null) ? 0 : this.description.hashCode());
/*     */     result = result * 31 + ((this.params == null) ? 0 : this.params.hashCode());
/*     */     return result * 31 + ((this.settings == null) ? 0 : this.settings.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MatterhornTool))
/*     */       return false; 
/*     */     MatterhornTool matterhornTool = (MatterhornTool)other;
/*     */     return !Intrinsics.areEqual(this.name, matterhornTool.name) ? false : (!Intrinsics.areEqual(this.type, matterhornTool.type) ? false : (!Intrinsics.areEqual(this.description, matterhornTool.description) ? false : (!Intrinsics.areEqual(this.params, matterhornTool.params) ? false : (!!Intrinsics.areEqual(this.settings, matterhornTool.settings)))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornTool.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */