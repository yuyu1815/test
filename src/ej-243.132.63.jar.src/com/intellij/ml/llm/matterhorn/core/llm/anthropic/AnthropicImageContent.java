/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
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
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("image")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'B\033\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\004\b\006\020\007B/\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\t\020\024\032\0020\003HÆ\003J\013\020\025\032\004\030\0010\005HÆ\003J\037\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\032HÖ\003J\t\020\033\032\0020\tHÖ\001J\t\020\034\032\0020\035HÖ\001J%\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$H\001¢\006\002\b%R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\r\020\016\032\004\b\017\020\020R\036\020\004\032\004\030\0010\0058\026X\004¢\006\016\n\000\022\004\b\021\020\016\032\004\b\022\020\023¨\006("}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicImageContent;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "source", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicSource;", "cache", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicSource;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicSource;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSource$annotations", "()V", "getSource", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicSource;", "getCache$annotations", "getCache", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AnthropicImageContent
/*    */   implements AnthropicContent
/*    */ {
/*    */   @NotNull
/* 50 */   public static final Companion Companion = new Companion(null); @NotNull private final AnthropicSource source; @Nullable private final AnthropicCacheControl cache; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[2]; KClass[] arrayOfKClass = new KClass[1]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(Base64AnthropicSource.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[1]; arrayOfKSerializer2[0] = (KSerializer)Base64AnthropicSource.$serializer.INSTANCE; arrayOfKSerializer1[0] = (KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicSource", Reflection.getOrCreateKotlinClass(AnthropicSource.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0]); arrayOfKSerializer1[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof AnthropicImageContent)) return false;  AnthropicImageContent anthropicImageContent = (AnthropicImageContent)other; return !Intrinsics.areEqual(this.source, anthropicImageContent.source) ? false : (!!Intrinsics.areEqual(this.cache, anthropicImageContent.cache)); } public int hashCode() { result = this.source.hashCode(); return result * 31 + ((this.cache == null) ? 0 : this.cache.hashCode()); } @NotNull public String toString() { return "AnthropicImageContent(source=" + this.source + ", cache=" + this.cache + ")"; } @NotNull public final AnthropicImageContent copy(@NotNull AnthropicSource source, @Nullable AnthropicCacheControl cache) { Intrinsics.checkNotNullParameter(source, "source"); return new AnthropicImageContent(source, cache); } @Nullable public final AnthropicCacheControl component2() { return this.cache; } @NotNull public final AnthropicSource component1() { return this.source; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicImageContent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicImageContent;", "core-llm"}) public static final class Companion { @NotNull public final KSerializer<AnthropicImageContent> serializer() { return (KSerializer<AnthropicImageContent>)AnthropicImageContent.$serializer.INSTANCE; } private Companion() {} } @Nullable
/*    */   public AnthropicCacheControl getCache() {
/* 52 */     return this.cache; } @NotNull public final AnthropicSource getSource() { return this.source; } public AnthropicImageContent(@NotNull AnthropicSource source, @Nullable AnthropicCacheControl cache) { this.source = source; this.cache = cache; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicImageContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */