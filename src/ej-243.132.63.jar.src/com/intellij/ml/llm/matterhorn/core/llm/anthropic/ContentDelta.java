/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bw\030\000 \0042\0020\001:\003\002\003\004\001\002\005\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;", "", "Text", "InputJson", "Companion", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta$InputJson;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta$Text;", "core-llm"})
/*    */ public interface ContentDelta
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;", "core-llm"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/*    */     public final KSerializer<ContentDelta> serializer() {
/* 57 */       KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ContentDelta.InputJson.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ContentDelta.Text.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)ContentDelta.InputJson.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)ContentDelta.Text.$serializer.INSTANCE; return (KSerializer<ContentDelta>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.core.llm.anthropic.ContentDelta", Reflection.getOrCreateKotlinClass(ContentDelta.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]); } } @Serializable @SerialName("text_delta") @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0262\0020\001:\002\025\026B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ%\020\r\032\0020\0162\006\020\017\032\0020\0002\006\020\020\032\0020\0212\006\020\022\032\0020\023H\001¢\006\002\b\024R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\f¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta$Text;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;", "text", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getText", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"}) public static final class Text implements ContentDelta { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String text; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta$Text$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta$Text;", "core-llm"})
/*    */     public static final class Companion { @NotNull
/* 59 */       public final KSerializer<ContentDelta.Text> serializer() { return (KSerializer<ContentDelta.Text>)ContentDelta.Text.$serializer.INSTANCE; } private Companion() {} } @NotNull
/* 60 */     public final String getText() { return this.text; } public Text(@NotNull String text) { this.text = text; } } @Serializable @SerialName("input_json_delta") @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0302\0020\001:\002\027\030B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ%\020\017\032\0020\0202\006\020\021\032\0020\0002\006\020\022\032\0020\0232\006\020\024\032\0020\025H\001¢\006\002\b\026R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\013\020\f\032\004\b\r\020\016¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta$InputJson;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;", "partialJson", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPartialJson$annotations", "()V", "getPartialJson", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"}) public static final class InputJson implements ContentDelta { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String partialJson; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta$InputJson$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta$InputJson;", "core-llm"})
/*    */     public static final class Companion { private Companion() {} @NotNull
/* 62 */       public final KSerializer<ContentDelta.InputJson> serializer() { return (KSerializer<ContentDelta.InputJson>)ContentDelta.InputJson.$serializer.INSTANCE; } } @NotNull
/* 63 */     public final String getPartialJson() { return this.partialJson; } public InputJson(@NotNull String partialJson) { this.partialJson = partialJson; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\ContentDelta.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */