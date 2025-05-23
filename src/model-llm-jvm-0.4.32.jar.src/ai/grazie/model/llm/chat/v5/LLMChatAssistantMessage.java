/*    */ package ai.grazie.model.llm.chat.v5;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.LLMChatRole;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
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
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
/*    */ @SerialName("assistant_message")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 '2\0020\001:\003&'(B7\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\033\022\b\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\007¢\006\002\020\rJ\013\020\024\032\004\030\0010\005HÆ\003J\013\020\025\032\004\030\0010\007HÆ\003J!\020\026\032\0020\0002\n\b\002\020\004\032\004\030\0010\0052\n\b\002\020\006\032\004\030\0010\007HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\032HÖ\003J\t\020\033\032\0020\003HÖ\001J\006\020\034\032\0020\030J\t\020\035\032\0020\005HÖ\001J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\016\020\017R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\020\020\021R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\022\020\023¨\006)"}, d2 = {"Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage;", "Lai/grazie/model/llm/chat/v5/LLMChatMessage;", "seen1", "", "content", "", "functionCall", "Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage$FunctionCallResponse;", "role", "Lai/grazie/model/llm/chat/LLMChatRole;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage$FunctionCallResponse;Lai/grazie/model/llm/chat/LLMChatRole;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage$FunctionCallResponse;)V", "getContent", "()Ljava/lang/String;", "getFunctionCall", "()Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage$FunctionCallResponse;", "getRole", "()Lai/grazie/model/llm/chat/LLMChatRole;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "isFunctionCall", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_llm", "$serializer", "Companion", "FunctionCallResponse", "model-llm"})
/*    */ public final class LLMChatAssistantMessage
/*    */   extends LLMChatMessage
/*    */ {
/*    */   @NotNull
/* 50 */   public static final Companion Companion = new Companion(null); @Nullable private final String content; @Nullable private final FunctionCallResponse functionCall; @NotNull private final LLMChatRole role; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = LLMChatRole.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/chat/v5/LLMChatAssistantMessage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"}) public static final class $serializer implements GeneratedSerializer<LLMChatAssistantMessage> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])LLMChatAssistantMessage.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)LLMChatAssistantMessage.FunctionCallResponse.$serializer.INSTANCE); arrayOfKSerializer2[2] = arrayOfKSerializer1[2]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public LLMChatAssistantMessage deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; LLMChatAssistantMessage.FunctionCallResponse functionCallResponse = null; LLMChatRole lLMChatRole = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])LLMChatAssistantMessage.$childSerializers; if (compositeDecoder.decodeSequentially()) { str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, str); i |= 0x1; functionCallResponse = (LLMChatAssistantMessage.FunctionCallResponse)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMChatAssistantMessage.FunctionCallResponse.$serializer.INSTANCE, functionCallResponse); i |= 0x2; lLMChatRole = (LLMChatRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], lLMChatRole); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, str); i |= 0x1; continue;case 1: functionCallResponse = (LLMChatAssistantMessage.FunctionCallResponse)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMChatAssistantMessage.FunctionCallResponse.$serializer.INSTANCE, functionCallResponse); i |= 0x2; continue;case 2: lLMChatRole = (LLMChatRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], lLMChatRole); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new LLMChatAssistantMessage(i, str, functionCallResponse, lLMChatRole, null); } public void serialize(@NotNull Encoder encoder, @NotNull LLMChatAssistantMessage value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LLMChatAssistantMessage.write$Self$model_llm(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("assistant_message", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("content", false); pluginGeneratedSerialDescriptor.addElement("functionCall", true); pluginGeneratedSerialDescriptor.addElement("role", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage;", "model-llm"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LLMChatAssistantMessage> serializer() { return (KSerializer<LLMChatAssistantMessage>)LLMChatAssistantMessage.$serializer.INSTANCE; }
/*    */      }
/*    */   
/* 53 */   public LLMChatAssistantMessage(@Nullable String content, @Nullable FunctionCallResponse functionCall) { super(null); this.content = content; this.functionCall = functionCall;
/* 54 */     this.role = LLMChatRole.Assistant; } @Nullable public String getContent() { return this.content; } @Nullable public final FunctionCallResponse getFunctionCall() { return this.functionCall; } @NotNull public LLMChatRole getRole() { return this.role; }
/*    */    @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\036\037B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\nJ\t\020\016\032\0020\005HÆ\003J\t\020\017\032\0020\005HÆ\003J\035\020\020\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\003HÖ\001J\t\020\025\032\0020\005HÖ\001J&\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034HÁ\001¢\006\002\b\035R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\f¨\006 "}, d2 = {"Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage$FunctionCallResponse;", "", "seen1", "", "functionName", "", "content", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getFunctionName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_llm", "$serializer", "Companion", "model-llm"})
/*    */   public static final class FunctionCallResponse { @NotNull
/*    */     public static final Companion Companion = new Companion(null); @NotNull
/*    */     private final String functionName; @NotNull
/*    */     private final String content;
/* 61 */     public FunctionCallResponse(@NotNull String functionName, @NotNull String content) { this.functionName = functionName; this.content = content; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/chat/v5/LLMChatAssistantMessage.FunctionCallResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage$FunctionCallResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"}) public static final class $serializer implements GeneratedSerializer<FunctionCallResponse> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public LLMChatAssistantMessage.FunctionCallResponse deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new LLMChatAssistantMessage.FunctionCallResponse(i, str1, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull LLMChatAssistantMessage.FunctionCallResponse value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LLMChatAssistantMessage.FunctionCallResponse.write$Self$model_llm(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.llm.chat.v5.LLMChatAssistantMessage.FunctionCallResponse", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("functionName", false); pluginGeneratedSerialDescriptor.addElement("content", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final String getFunctionName() { return this.functionName; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage$FunctionCallResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage$FunctionCallResponse;", "model-llm"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LLMChatAssistantMessage.FunctionCallResponse> serializer() { return (KSerializer<LLMChatAssistantMessage.FunctionCallResponse>)LLMChatAssistantMessage.FunctionCallResponse.$serializer.INSTANCE; } } @NotNull public final String getContent() { return this.content; } @NotNull public final String component1() { return this.functionName; } @NotNull public final String component2() { return this.content; } @NotNull public final FunctionCallResponse copy(@NotNull String functionName, @NotNull String content) { Intrinsics.checkNotNullParameter(functionName, "functionName"); Intrinsics.checkNotNullParameter(content, "content"); return new FunctionCallResponse(functionName, content); } @NotNull public String toString() { return "FunctionCallResponse(functionName=" + this.functionName + ", content=" + this.content + ")"; } public int hashCode() { result = this.functionName.hashCode(); return result * 31 + this.content.hashCode(); }
/*    */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof FunctionCallResponse)) return false;  FunctionCallResponse functionCallResponse = (FunctionCallResponse)other; return !Intrinsics.areEqual(this.functionName, functionCallResponse.functionName) ? false : (!!Intrinsics.areEqual(this.content, functionCallResponse.content)); } }
/* 63 */   public final boolean isFunctionCall() { return (this.functionCall != null); }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/chat/v5/LLMChatAssistantMessage.FunctionCallResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/chat/v5/LLMChatAssistantMessage$FunctionCallResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"})
/*    */   public static final class $serializer implements GeneratedSerializer<FunctionCallResponse> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public LLMChatAssistantMessage.FunctionCallResponse deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null, str2 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new LLMChatAssistantMessage.FunctionCallResponse(i, str1, str2, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull LLMChatAssistantMessage.FunctionCallResponse value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       LLMChatAssistantMessage.FunctionCallResponse.write$Self$model_llm(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.llm.chat.v5.LLMChatAssistantMessage.FunctionCallResponse", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("functionName", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("content", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component1() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final FunctionCallResponse component2() {
/*    */     return this.functionCall;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMChatAssistantMessage copy(@Nullable String content, @Nullable FunctionCallResponse functionCall) {
/*    */     return new LLMChatAssistantMessage(content, functionCall);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LLMChatAssistantMessage(content=" + this.content + ", functionCall=" + this.functionCall + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.content == null) ? 0 : this.content.hashCode();
/*    */     return result * 31 + ((this.functionCall == null) ? 0 : this.functionCall.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LLMChatAssistantMessage))
/*    */       return false; 
/*    */     LLMChatAssistantMessage lLMChatAssistantMessage = (LLMChatAssistantMessage)other;
/*    */     return !Intrinsics.areEqual(this.content, lLMChatAssistantMessage.content) ? false : (!!Intrinsics.areEqual(this.functionCall, lLMChatAssistantMessage.functionCall));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\v5\LLMChatAssistantMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */