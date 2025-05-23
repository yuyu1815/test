/*     */ package ai.grazie.api.gateway.api.task;
/*     */ import ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEEventType;
/*     */ import ai.grazie.utils.data.DataHolder;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\t\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\006\030\031\032\033\034\035B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\034\020\t\032\0020\n8\026XD¢\006\016\n\000\022\004\b\013\020\004\032\004\b\f\020\rR\032\020\016\032\b\022\004\022\0020\0020\017X\004¢\006\b\n\000\032\004\b\020\020\021R\032\020\022\032\b\022\004\022\0020\0030\017X\004¢\006\b\n\000\032\004\b\023\020\021R\024\020\024\032\0020\025X\004¢\006\b\n\000\032\004\b\026\020\027¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$Request;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath$annotations", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "sseConfig", "Lai/grazie/model/cloud/SseConfig;", "getSseConfig", "()Lai/grazie/model/cloud/SseConfig;", "Request", "Response", "V1", "V2", "V3", "V4", "api-gateway-api"})
/*     */ @SourceDebugExtension({"SMAP\nTaskAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskAPI.kt\nai/grazie/api/gateway/api/task/TaskAPI$Stream\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,217:1\n19#2,2:218\n19#2,2:220\n*S KotlinDebug\n*F\n+ 1 TaskAPI.kt\nai/grazie/api/gateway/api/task/TaskAPI$Stream\n*L\n20#1:218,2\n21#1:220,2\n*E\n"})
/*     */ public final class Stream implements TypedApi<TaskAPI.Stream.Request, TaskAPI.Stream.Response> {
/*     */   @NotNull
/*  20 */   public static final Stream INSTANCE = new Stream(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 218 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 219 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 220 */     kType$iv = Reflection.typeOf(Response.class);
/* 221 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @NotNull public TypeInfo<Response> getResponseType() { return responseType; } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final SseConfig sseConfig = new SseConfig(null, 1, null); @NotNull public SseConfig getSseConfig() { return sseConfig; } @NotNull private static final String path = "/task/stream"; @NotNull public String getPath() { return path; } @Serializable @Deprecated(message = "In favor of Stream.V2.Request") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\030HÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006#"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$Request;", "", "seen1", "", "task", "Lai/grazie/model/task/id/TaskID;", "parameters", "Lai/grazie/model/task/exec/TaskParameters;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/task/id/TaskID;Lai/grazie/model/task/exec/TaskParameters;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/task/id/TaskID;Lai/grazie/model/task/exec/TaskParameters;)V", "getParameters", "()Lai/grazie/model/task/exec/TaskParameters;", "getTask", "()Lai/grazie/model/task/id/TaskID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Request { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final TaskID task; @NotNull private final TaskParameters parameters; public Request(@NotNull TaskID task, @NotNull TaskParameters parameters) { this.task = task; this.parameters = parameters; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)TaskID.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)TaskParameters.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public TaskAPI.Stream.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; TaskID taskID = null; TaskParameters taskParameters = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { taskID = (TaskID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TaskID.Serializer.INSTANCE, taskID); i |= 0x1; taskParameters = (TaskParameters)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TaskParameters.Serializer.INSTANCE, taskParameters); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: taskID = (TaskID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TaskID.Serializer.INSTANCE, taskID); i |= 0x1; continue;case 1: taskParameters = (TaskParameters)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TaskParameters.Serializer.INSTANCE, taskParameters); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.Request(i, taskID, taskParameters, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.task.TaskAPI.Stream.Request", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("task", false); pluginGeneratedSerialDescriptor.addElement("parameters", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.Request> serializer() { return (KSerializer<TaskAPI.Stream.Request>)TaskAPI.Stream.Request.$serializer.INSTANCE; } } @NotNull public final TaskID getTask() { return this.task; } @NotNull public final TaskParameters getParameters() { return this.parameters; } @NotNull public final TaskID component1() { return this.task; } @NotNull public final TaskParameters component2() { return this.parameters; } @NotNull public final Request copy(@NotNull TaskID task, @NotNull TaskParameters parameters) { Intrinsics.checkNotNullParameter(task, "task"); Intrinsics.checkNotNullParameter(parameters, "parameters"); return new Request(task, parameters); } @NotNull public String toString() { return "Request(task=" + this.task + ", parameters=" + this.parameters + ")"; } public int hashCode() { result = this.task.hashCode(); return result * 31 + this.parameters.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Request)) return false;  Request request = (Request)other; return !Intrinsics.areEqual(this.task, request.task) ? false : (!!Intrinsics.areEqual(this.parameters, request.parameters)); } } @Serializable @Deprecated(message = "In favor of Stream.V2.Response") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\036\037B/\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\r\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\016\032\0020\007HÆ\003J\023\020\017\032\0020\0002\b\b\002\020\006\032\0020\007HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\003HÖ\001J\t\020\025\032\0020\007HÖ\001J&\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034HÁ\001¢\006\002\b\035R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\r¨\006 "}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$Response;", "Lai/grazie/model/cloud/sse/continuous/Data;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "current", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getCurrent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response extends Data { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String current; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !!Intrinsics.areEqual(this.current, response.current); } public int hashCode() { return this.current.hashCode(); } @NotNull public String toString() { return "Response(current=" + this.current + ")"; } @NotNull public final Response copy(@NotNull String current) { Intrinsics.checkNotNullParameter(current, "current"); return new Response(current); } @NotNull public final String component1() { return this.current; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TaskAPI.Stream.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.Response.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.Response(i, continuousSSEEventType, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.task.TaskAPI.Stream.Response", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("current", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.Response> serializer() { return (KSerializer<TaskAPI.Stream.Response>)TaskAPI.Stream.Response.$serializer.INSTANCE; } } @NotNull public final String getCurrent() { return this.current; } public Response(@NotNull String current) { this.current = current; } } @Deprecated(message = "in favour of V4") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\bÇ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020R\024\020\023\032\0020\024X\004¢\006\b\n\000\032\004\b\025\020\026¨\006\027"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V1;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$Request;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "sseConfig", "Lai/grazie/model/cloud/SseConfig;", "getSseConfig", "()Lai/grazie/model/cloud/SseConfig;", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nTaskAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskAPI.kt\nai/grazie/api/gateway/api/task/TaskAPI$Stream$V1\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,217:1\n19#2,2:218\n19#2,2:220\n*S KotlinDebug\n*F\n+ 1 TaskAPI.kt\nai/grazie/api/gateway/api/task/TaskAPI$Stream$V1\n*L\n40#1:218,2\n41#1:220,2\n*E\n"}) public static final class V1 implements TypedApi<Request, Response> { @NotNull public static final V1 INSTANCE = new V1(); @NotNull private static final TypeInfo<TaskAPI.Stream.Request> requestType; @NotNull private static final TypeInfo<TaskAPI.Stream.Response> responseType; @NotNull public TypeInfo<TaskAPI.Stream.Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(TaskAPI.Stream.Request.class); requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(TaskAPI.Stream.Request.class)); $i$f$typeInfo = 0; kType$iv = Reflection.typeOf(TaskAPI.Stream.Response.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(TaskAPI.Stream.Response.class)); } @NotNull public TypeInfo<TaskAPI.Stream.Response> getResponseType() { return responseType; } @NotNull private static final SseConfig sseConfig = new SseConfig(null, 1, null); @NotNull public SseConfig getSseConfig() { return sseConfig; } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/task/stream"; @NotNull public String getPath() { return path; } } @Deprecated(message = "in favour of V4") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\bÇ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\027\030B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020R\024\020\023\032\0020\024X\004¢\006\b\n\000\032\004\b\025\020\026¨\006\031"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$Request;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "sseConfig", "Lai/grazie/model/cloud/SseConfig;", "getSseConfig", "()Lai/grazie/model/cloud/SseConfig;", "Request", "TaskData", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nTaskAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskAPI.kt\nai/grazie/api/gateway/api/task/TaskAPI$Stream$V2\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,217:1\n19#2,2:218\n19#2,2:220\n*S KotlinDebug\n*F\n+ 1 TaskAPI.kt\nai/grazie/api/gateway/api/task/TaskAPI$Stream$V2\n*L\n49#1:218,2\n50#1:220,2\n*E\n"}) public static final class V2 implements TypedApi<V2.Request, V2.TaskData> { @NotNull public static final V2 INSTANCE = new V2(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<TaskData> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Request.class); requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0; kType$iv = Reflection.typeOf(TaskData.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(TaskData.class)); } @NotNull public TypeInfo<TaskData> getResponseType() { return responseType; } @NotNull private static final SseConfig sseConfig = new SseConfig(null, 1, null); @NotNull public SseConfig getSseConfig() { return sseConfig; } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/task/stream/v2"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\030HÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006#"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$Request;", "", "seen1", "", "task", "Lai/grazie/model/task/id/TaskID;", "parameters", "Lai/grazie/model/task/exec/TaskParameters;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/task/id/TaskID;Lai/grazie/model/task/exec/TaskParameters;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/task/id/TaskID;Lai/grazie/model/task/exec/TaskParameters;)V", "getParameters", "()Lai/grazie/model/task/exec/TaskParameters;", "getTask", "()Lai/grazie/model/task/id/TaskID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Request { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final TaskID task; @NotNull private final TaskParameters parameters; public Request(@NotNull TaskID task, @NotNull TaskParameters parameters) { this.task = task; this.parameters = parameters; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V2.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)TaskID.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)TaskParameters.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public TaskAPI.Stream.V2.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; TaskID taskID = null; TaskParameters taskParameters = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { taskID = (TaskID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TaskID.Serializer.INSTANCE, taskID); i |= 0x1; taskParameters = (TaskParameters)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TaskParameters.Serializer.INSTANCE, taskParameters); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: taskID = (TaskID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TaskID.Serializer.INSTANCE, taskID); i |= 0x1; continue;case 1: taskParameters = (TaskParameters)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TaskParameters.Serializer.INSTANCE, taskParameters); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.V2.Request(i, taskID, taskParameters, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V2.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.V2.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.task.TaskAPI.Stream.V2.Request", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("task", false); pluginGeneratedSerialDescriptor.addElement("parameters", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V2.Request> serializer() { return (KSerializer<TaskAPI.Stream.V2.Request>)TaskAPI.Stream.V2.Request.$serializer.INSTANCE; } } @NotNull public final TaskID getTask() { return this.task; } @NotNull public final TaskParameters getParameters() { return this.parameters; } @NotNull public final TaskID component1() { return this.task; } @NotNull public final TaskParameters component2() { return this.parameters; } @NotNull public final Request copy(@NotNull TaskID task, @NotNull TaskParameters parameters) { Intrinsics.checkNotNullParameter(task, "task"); Intrinsics.checkNotNullParameter(parameters, "parameters"); return new Request(task, parameters); } @NotNull public String toString() { return "Request(task=" + this.task + ", parameters=" + this.parameters + ")"; } public int hashCode() { result = this.task.hashCode(); return result * 31 + this.parameters.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Request)) return false;  Request request = (Request)other; return !Intrinsics.areEqual(this.task, request.task) ? false : (!!Intrinsics.areEqual(this.parameters, request.parameters)); } } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\000 \0252\0020\001:\005\025\026\027\030\031B%\b\027\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\007\b\004¢\006\002\020\tJ!\020\016\032\0020\0172\006\020\020\032\0020\0002\006\020\021\032\0020\0222\006\020\023\032\0020\024HÇ\001R\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\r\001\004\032\033\034\035¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData;", "Lai/grazie/model/cloud/sse/continuous/Data;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "content", "", "getContent", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Content", "ExecutionMetadata", "FunctionCall", "QuotaMetadata", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$Content;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$ExecutionMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$FunctionCall;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$QuotaMetadata;", "api-gateway-api"}) public static abstract class TaskData extends Data { @NotNull public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public abstract String getContent(); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { KClass[] arrayOfKClass = new KClass[4]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V2.TaskData.Content.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V2.TaskData.ExecutionMetadata.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V2.TaskData.FunctionCall.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V2.TaskData.QuotaMetadata.class); KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)TaskAPI.Stream.V2.TaskData.Content.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)TaskAPI.Stream.V2.TaskData.ExecutionMetadata.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)TaskAPI.Stream.V2.TaskData.FunctionCall.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)TaskAPI.Stream.V2.TaskData.QuotaMetadata.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.api.gateway.api.task.TaskAPI.Stream.V2.TaskData", Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V2.TaskData.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V2.TaskData> serializer() { return get$cachedSerializer(); } } private TaskData() {} @Serializable @SerialName("Content") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\036\037B/\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\r\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\016\032\0020\007HÆ\003J\023\020\017\032\0020\0002\b\b\002\020\006\032\0020\007HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\003HÖ\001J\t\020\025\032\0020\007HÖ\001J&\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034HÁ\001¢\006\002\b\035R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\f\020\r¨\006 "}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$Content;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Content extends TaskData { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Content)) return false;  Content content = (Content)other; return !!Intrinsics.areEqual(this.content, content.content); } public int hashCode() { return this.content.hashCode(); } @NotNull public String toString() { return "Content(content=" + this.content + ")"; } @NotNull public final Content copy(@NotNull String content) { Intrinsics.checkNotNullParameter(content, "content"); return new Content(content); } @NotNull public final String component1() { return this.content; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V2.TaskData.Content.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$Content;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Content> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V2.TaskData.Content.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TaskAPI.Stream.V2.TaskData.Content deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V2.TaskData.Content.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.V2.TaskData.Content(i, continuousSSEEventType, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V2.TaskData.Content value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.V2.TaskData.Content.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Content", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("content", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$Content$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$Content;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V2.TaskData.Content> serializer() { return (KSerializer<TaskAPI.Stream.V2.TaskData.Content>)TaskAPI.Stream.V2.TaskData.Content.$serializer.INSTANCE; } } @NotNull public String getContent() { return this.content; } public Content(@NotNull String content) { super(null); this.content = content; } } @Serializable @SerialName("QuotaMetadata") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(BC\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B\025\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\017J\t\020\026\032\0020\007HÆ\003J\t\020\027\032\0020\tHÆ\003J\035\020\030\032\0020\0002\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\034HÖ\003J\t\020\035\032\0020\003HÖ\001J\t\020\036\032\0020\013HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\024\020\n\032\0020\013XD¢\006\b\n\000\032\004\b\020\020\021R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025¨\006)"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$QuotaMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "updated", "Lai/grazie/quota/Quota;", "spent", "Lai/grazie/utils/mpp/money/Credit;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;)V", "getContent", "()Ljava/lang/String;", "getSpent", "()Lai/grazie/utils/mpp/money/Credit;", "getUpdated", "()Lai/grazie/quota/Quota;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class QuotaMetadata extends TaskData { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Quota updated; @NotNull private final Credit spent; @NotNull private final String content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V2.TaskData.QuotaMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$QuotaMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<QuotaMetadata> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V2.TaskData.QuotaMetadata.$childSerializers, arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)Quota$.serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)Credit$.serializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TaskAPI.Stream.V2.TaskData.QuotaMetadata deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; Quota quota = null; Credit credit = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V2.TaskData.QuotaMetadata.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota); i |= 0x2; credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit); i |= 0x4; str = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota); i |= 0x2; continue;case 2: credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit); i |= 0x4; continue;case 3: str = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.V2.TaskData.QuotaMetadata(i, continuousSSEEventType, quota, credit, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V2.TaskData.QuotaMetadata value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.V2.TaskData.QuotaMetadata.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("QuotaMetadata", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("updated", false); pluginGeneratedSerialDescriptor.addElement("spent", false); pluginGeneratedSerialDescriptor.addElement("content", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$QuotaMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$QuotaMetadata;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V2.TaskData.QuotaMetadata> serializer() { return (KSerializer<TaskAPI.Stream.V2.TaskData.QuotaMetadata>)TaskAPI.Stream.V2.TaskData.QuotaMetadata.$serializer.INSTANCE; } } public QuotaMetadata(@NotNull Quota updated, @NotNull Credit spent) { super(null); this.updated = updated; this.spent = spent; this.content = ""; } @NotNull public final Quota getUpdated() { return this.updated; } @NotNull public final Credit getSpent() { return this.spent; } @NotNull public String getContent() { return this.content; } @NotNull public final Quota component1() { return this.updated; } @NotNull public final Credit component2() { return this.spent; } @NotNull public final QuotaMetadata copy(@NotNull Quota updated, @NotNull Credit spent) { Intrinsics.checkNotNullParameter(updated, "updated"); Intrinsics.checkNotNullParameter(spent, "spent"); return new QuotaMetadata(updated, spent); } @NotNull public String toString() { return "QuotaMetadata(updated=" + this.updated + ", spent=" + this.spent + ")"; } public int hashCode() { result = this.updated.hashCode(); return result * 31 + this.spent.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof QuotaMetadata)) return false;  QuotaMetadata quotaMetadata = (QuotaMetadata)other; return !Intrinsics.areEqual(this.updated, quotaMetadata.updated) ? false : (!!Intrinsics.areEqual(this.spent, quotaMetadata.spent)); } } @Serializable @SerialName("ExecutionMetadata") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B9\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\r\022\006\020\006\032\0020\007¢\006\002\020\rJ\t\020\022\032\0020\007HÆ\003J\023\020\023\032\0020\0002\b\b\002\020\006\032\0020\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\003HÖ\001J\t\020\031\032\0020\tHÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\020\020\021¨\006$"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$ExecutionMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "attributes", "Lai/grazie/utils/attributes/Attributes;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lai/grazie/utils/attributes/Attributes;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/attributes/Attributes;)V", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class ExecutionMetadata extends TaskData { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Attributes attributes; @NotNull private final String content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V2.TaskData.ExecutionMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$ExecutionMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<ExecutionMetadata> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V2.TaskData.ExecutionMetadata.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)Attributes$.serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TaskAPI.Stream.V2.TaskData.ExecutionMetadata deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; Attributes attributes = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V2.TaskData.ExecutionMetadata.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; attributes = (Attributes)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes); i |= 0x2; str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: attributes = (Attributes)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes); i |= 0x2; continue;case 2: str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.V2.TaskData.ExecutionMetadata(i, continuousSSEEventType, attributes, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V2.TaskData.ExecutionMetadata value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.V2.TaskData.ExecutionMetadata.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ExecutionMetadata", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("attributes", false); pluginGeneratedSerialDescriptor.addElement("content", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$ExecutionMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$ExecutionMetadata;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V2.TaskData.ExecutionMetadata> serializer() { return (KSerializer<TaskAPI.Stream.V2.TaskData.ExecutionMetadata>)TaskAPI.Stream.V2.TaskData.ExecutionMetadata.$serializer.INSTANCE; } } public ExecutionMetadata(@NotNull Attributes attributes) { super(null); this.attributes = attributes; this.content = ""; } @NotNull public final Attributes getAttributes() { return this.attributes; } @NotNull public String getContent() { return this.content; } @NotNull public final Attributes component1() { return this.attributes; } @NotNull public final ExecutionMetadata copy(@NotNull Attributes attributes) { Intrinsics.checkNotNullParameter(attributes, "attributes"); return new ExecutionMetadata(attributes); } @NotNull public String toString() { return "ExecutionMetadata(attributes=" + this.attributes + ")"; } public int hashCode() { return this.attributes.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof ExecutionMetadata)) return false;  ExecutionMetadata executionMetadata = (ExecutionMetadata)other; return !!Intrinsics.areEqual(this.attributes, executionMetadata.attributes); } } @Serializable @SerialName("FunctionCall") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B9\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\031\022\n\b\002\020\006\032\004\030\0010\007\022\006\020\b\032\0020\007¢\006\002\020\fJ\013\020\020\032\004\030\0010\007HÆ\003J\t\020\021\032\0020\007HÆ\003J\037\020\022\032\0020\0002\n\b\002\020\006\032\004\030\0010\0072\b\b\002\020\b\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\007HÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\024\020\b\032\0020\007X\004¢\006\b\n\000\032\004\b\r\020\016R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\017\020\016¨\006#"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$FunctionCall;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "name", "", "content", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class FunctionCall extends TaskData { @NotNull public static final Companion Companion = new Companion(null); @Nullable private final String name; @NotNull private final String content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof FunctionCall)) return false;  FunctionCall functionCall = (FunctionCall)other; return !Intrinsics.areEqual(this.name, functionCall.name) ? false : (!!Intrinsics.areEqual(this.content, functionCall.content)); } public int hashCode() { result = (this.name == null) ? 0 : this.name.hashCode(); return result * 31 + this.content.hashCode(); } @NotNull public String toString() { return "FunctionCall(name=" + this.name + ", content=" + this.content + ")"; } @NotNull public final FunctionCall copy(@Nullable String name, @NotNull String content) { Intrinsics.checkNotNullParameter(content, "content"); return new FunctionCall(name, content); } @NotNull public final String component2() { return this.content; } @Nullable public final String component1() { return this.name; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V2.TaskData.FunctionCall.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$FunctionCall;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<FunctionCall> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V2.TaskData.FunctionCall.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TaskAPI.Stream.V2.TaskData.FunctionCall deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; String str1 = null, str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V2.TaskData.FunctionCall.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x2; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x2; continue;case 2: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.V2.TaskData.FunctionCall(i, continuousSSEEventType, str1, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V2.TaskData.FunctionCall value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.V2.TaskData.FunctionCall.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FunctionCall", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("name", true); pluginGeneratedSerialDescriptor.addElement("content", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$FunctionCall$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V2$TaskData$FunctionCall;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V2.TaskData.FunctionCall> serializer() { return (KSerializer<TaskAPI.Stream.V2.TaskData.FunctionCall>)TaskAPI.Stream.V2.TaskData.FunctionCall.$serializer.INSTANCE; } } @NotNull public String getContent() { return this.content; } @Nullable public final String getName() { return this.name; } public FunctionCall(@Nullable String name, @NotNull String content) { super(null); this.name = name; this.content = content; } } } } @Deprecated(message = "in favour of V4") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\bÇ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\003\027\030\031B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020R\024\020\023\032\0020\024X\004¢\006\b\n\000\032\004\b\025\020\026¨\006\032"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$Request;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "sseConfig", "Lai/grazie/model/cloud/SseConfig;", "getSseConfig", "()Lai/grazie/model/cloud/SseConfig;", "Request", "TaskData", "TaskDataSerializer", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nTaskAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskAPI.kt\nai/grazie/api/gateway/api/task/TaskAPI$Stream$V3\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,217:1\n19#2,2:218\n19#2,2:220\n*S KotlinDebug\n*F\n+ 1 TaskAPI.kt\nai/grazie/api/gateway/api/task/TaskAPI$Stream$V3\n*L\n86#1:218,2\n87#1:220,2\n*E\n"}) public static final class V3 implements TypedApi<V3.Request, V3.TaskData> { @NotNull public static final V3 INSTANCE = new V3(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<TaskData> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } @NotNull public TypeInfo<TaskData> getResponseType() { return responseType; } @NotNull private static final SseConfig sseConfig = new SseConfig(Reflection.getOrCreateKotlinClass(TaskData.UnknownMetadata.class)); @NotNull public SseConfig getSseConfig() { return sseConfig; } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/task/stream/v3"; static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Request.class); requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0; kType$iv = Reflection.typeOf(TaskData.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(TaskData.class)); } @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\030HÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006#"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$Request;", "", "seen1", "", "task", "Lai/grazie/model/task/id/TaskName;", "parameters", "Lai/grazie/utils/data/DataHolder;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/task/id/TaskName;Lai/grazie/utils/data/DataHolder;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/task/id/TaskName;Lai/grazie/utils/data/DataHolder;)V", "getParameters", "()Lai/grazie/utils/data/DataHolder;", "getTask", "()Lai/grazie/model/task/id/TaskName;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Request { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final TaskName task; @NotNull private final DataHolder parameters; public Request(@NotNull TaskName task, @NotNull DataHolder parameters) { this.task = task; this.parameters = parameters; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V3.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)TaskName.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)DataHolderSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public TaskAPI.Stream.V3.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; TaskName taskName = null; DataHolder dataHolder = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { taskName = (TaskName)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TaskName.Serializer.INSTANCE, taskName); i |= 0x1; dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: taskName = (TaskName)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TaskName.Serializer.INSTANCE, taskName); i |= 0x1; continue;case 1: dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.V3.Request(i, taskName, dataHolder, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V3.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.V3.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.task.TaskAPI.Stream.V3.Request", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("task", false); pluginGeneratedSerialDescriptor.addElement("parameters", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V3.Request> serializer() { return (KSerializer<TaskAPI.Stream.V3.Request>)TaskAPI.Stream.V3.Request.$serializer.INSTANCE; } } @NotNull public final TaskName getTask() { return this.task; } @NotNull public final DataHolder getParameters() { return this.parameters; } @NotNull public final TaskName component1() { return this.task; } @NotNull public final DataHolder component2() { return this.parameters; } @NotNull public final Request copy(@NotNull TaskName task, @NotNull DataHolder parameters) { Intrinsics.checkNotNullParameter(task, "task"); Intrinsics.checkNotNullParameter(parameters, "parameters"); return new Request(task, parameters); } @NotNull public String toString() { return "Request(task=" + this.task + ", parameters=" + this.parameters + ")"; } public int hashCode() { result = this.task.hashCode(); return result * 31 + this.parameters.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Request)) return false;  Request request = (Request)other; return !Intrinsics.areEqual(this.task, request.task) ? false : (!!Intrinsics.areEqual(this.parameters, request.parameters)); } } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\000 \0252\0020\001:\007\025\026\027\030\031\032\033B%\b\027\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\007\b\004¢\006\002\020\tJ!\020\016\032\0020\0172\006\020\020\032\0020\0002\006\020\021\032\0020\0222\006\020\023\032\0020\024HÇ\001R\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\r\001\006\034\035\036\037 !¨\006\""}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData;", "Lai/grazie/model/cloud/sse/continuous/Data;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "content", "", "getContent", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Content", "ExecutionMetadata", "FinishMetadata", "FunctionCall", "QuotaMetadata", "UnknownMetadata", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$Content;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$ExecutionMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FinishMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FunctionCall;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$QuotaMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$UnknownMetadata;", "api-gateway-api"}) public static abstract class TaskData extends Data { @NotNull public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public abstract String getContent(); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.Content.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.ExecutionMetadata.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.FinishMetadata.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.FunctionCall.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.QuotaMetadata.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.UnknownMetadata.class); KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)TaskAPI.Stream.V3.TaskData.Content.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)TaskAPI.Stream.V3.TaskData.ExecutionMetadata.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)TaskAPI.Stream.V3.TaskData.FinishMetadata.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)TaskAPI.Stream.V3.TaskData.FunctionCall.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)TaskAPI.Stream.V3.TaskData.QuotaMetadata.$serializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)new ObjectSerializer("UnknownMetadata", TaskAPI.Stream.V3.TaskData.UnknownMetadata.INSTANCE, new java.lang.annotation.Annotation[0]); return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.api.gateway.api.task.TaskAPI.Stream.V3.TaskData", Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V3.TaskData> serializer() { return get$cachedSerializer(); } } private TaskData() {} @Serializable @SerialName("Content") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\036\037B/\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\r\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\016\032\0020\007HÆ\003J\023\020\017\032\0020\0002\b\b\002\020\006\032\0020\007HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\003HÖ\001J\t\020\025\032\0020\007HÖ\001J&\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034HÁ\001¢\006\002\b\035R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\f\020\r¨\006 "}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$Content;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Content extends TaskData { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Content)) return false;  Content content = (Content)other; return !!Intrinsics.areEqual(this.content, content.content); } public int hashCode() { return this.content.hashCode(); } @NotNull public String toString() { return "Content(content=" + this.content + ")"; } @NotNull public final Content copy(@NotNull String content) { Intrinsics.checkNotNullParameter(content, "content"); return new Content(content); } @NotNull public final String component1() { return this.content; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V3.TaskData.Content.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$Content;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Content> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V3.TaskData.Content.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TaskAPI.Stream.V3.TaskData.Content deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V3.TaskData.Content.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.V3.TaskData.Content(i, continuousSSEEventType, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V3.TaskData.Content value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.V3.TaskData.Content.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Content", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("content", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$Content$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$Content;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V3.TaskData.Content> serializer() { return (KSerializer<TaskAPI.Stream.V3.TaskData.Content>)TaskAPI.Stream.V3.TaskData.Content.$serializer.INSTANCE; } } @NotNull public String getContent() { return this.content; } public Content(@NotNull String content) { super(null); this.content = content; } } @Serializable @SerialName("QuotaMetadata") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(BC\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B\025\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\017J\t\020\026\032\0020\007HÆ\003J\t\020\027\032\0020\tHÆ\003J\035\020\030\032\0020\0002\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\034HÖ\003J\t\020\035\032\0020\003HÖ\001J\t\020\036\032\0020\013HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\024\020\n\032\0020\013XD¢\006\b\n\000\032\004\b\020\020\021R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025¨\006)"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$QuotaMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "updated", "Lai/grazie/quota/Quota;", "spent", "Lai/grazie/utils/mpp/money/Credit;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;)V", "getContent", "()Ljava/lang/String;", "getSpent", "()Lai/grazie/utils/mpp/money/Credit;", "getUpdated", "()Lai/grazie/quota/Quota;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class QuotaMetadata extends TaskData { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Quota updated; @NotNull private final Credit spent; @NotNull private final String content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V3.TaskData.QuotaMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$QuotaMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<QuotaMetadata> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V3.TaskData.QuotaMetadata.$childSerializers, arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)Quota$.serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)Credit$.serializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TaskAPI.Stream.V3.TaskData.QuotaMetadata deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; Quota quota = null; Credit credit = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V3.TaskData.QuotaMetadata.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota); i |= 0x2; credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit); i |= 0x4; str = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota); i |= 0x2; continue;case 2: credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit); i |= 0x4; continue;case 3: str = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.V3.TaskData.QuotaMetadata(i, continuousSSEEventType, quota, credit, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V3.TaskData.QuotaMetadata value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.V3.TaskData.QuotaMetadata.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("QuotaMetadata", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("updated", false); pluginGeneratedSerialDescriptor.addElement("spent", false); pluginGeneratedSerialDescriptor.addElement("content", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$QuotaMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$QuotaMetadata;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V3.TaskData.QuotaMetadata> serializer() { return (KSerializer<TaskAPI.Stream.V3.TaskData.QuotaMetadata>)TaskAPI.Stream.V3.TaskData.QuotaMetadata.$serializer.INSTANCE; } } public QuotaMetadata(@NotNull Quota updated, @NotNull Credit spent) { super(null); this.updated = updated; this.spent = spent; this.content = ""; } @NotNull public final Quota getUpdated() { return this.updated; } @NotNull public final Credit getSpent() { return this.spent; } @NotNull public String getContent() { return this.content; } @NotNull public final Quota component1() { return this.updated; } @NotNull public final Credit component2() { return this.spent; } @NotNull public final QuotaMetadata copy(@NotNull Quota updated, @NotNull Credit spent) { Intrinsics.checkNotNullParameter(updated, "updated"); Intrinsics.checkNotNullParameter(spent, "spent"); return new QuotaMetadata(updated, spent); } @NotNull public String toString() { return "QuotaMetadata(updated=" + this.updated + ", spent=" + this.spent + ")"; } public int hashCode() { result = this.updated.hashCode(); return result * 31 + this.spent.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof QuotaMetadata)) return false;  QuotaMetadata quotaMetadata = (QuotaMetadata)other; return !Intrinsics.areEqual(this.updated, quotaMetadata.updated) ? false : (!!Intrinsics.areEqual(this.spent, quotaMetadata.spent)); } } @Serializable @SerialName("FinishMetadata") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B9\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\r\022\006\020\006\032\0020\007¢\006\002\020\rJ\t\020\022\032\0020\007HÆ\003J\023\020\023\032\0020\0002\b\b\002\020\006\032\0020\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\003HÖ\001J\t\020\031\032\0020\tHÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021¨\006$"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FinishMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "reason", "Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;)V", "getContent", "()Ljava/lang/String;", "getReason", "()Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class FinishMetadata extends TaskData { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final LLMStreamFinishReason reason; @NotNull private final String content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V3.TaskData.FinishMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FinishMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<FinishMetadata> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V3.TaskData.FinishMetadata.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)LLMStreamFinishReason.Serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TaskAPI.Stream.V3.TaskData.FinishMetadata deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; LLMStreamFinishReason lLMStreamFinishReason = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V3.TaskData.FinishMetadata.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; lLMStreamFinishReason = (LLMStreamFinishReason)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMStreamFinishReason.Serializer.INSTANCE, lLMStreamFinishReason); i |= 0x2; str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: lLMStreamFinishReason = (LLMStreamFinishReason)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMStreamFinishReason.Serializer.INSTANCE, lLMStreamFinishReason); i |= 0x2; continue;case 2: str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.V3.TaskData.FinishMetadata(i, continuousSSEEventType, lLMStreamFinishReason, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V3.TaskData.FinishMetadata value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.V3.TaskData.FinishMetadata.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FinishMetadata", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("reason", false); pluginGeneratedSerialDescriptor.addElement("content", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FinishMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FinishMetadata;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V3.TaskData.FinishMetadata> serializer() { return (KSerializer<TaskAPI.Stream.V3.TaskData.FinishMetadata>)TaskAPI.Stream.V3.TaskData.FinishMetadata.$serializer.INSTANCE; } } public FinishMetadata(@NotNull LLMStreamFinishReason reason) { super(null); this.reason = reason; this.content = ""; } @NotNull public final LLMStreamFinishReason getReason() { return this.reason; } @NotNull public String getContent() { return this.content; } @NotNull public final LLMStreamFinishReason component1() { return this.reason; } @NotNull public final FinishMetadata copy(@NotNull LLMStreamFinishReason reason) { Intrinsics.checkNotNullParameter(reason, "reason"); return new FinishMetadata(reason); } @NotNull public String toString() { return "FinishMetadata(reason=" + this.reason + ")"; } public int hashCode() { return this.reason.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof FinishMetadata)) return false;  FinishMetadata finishMetadata = (FinishMetadata)other; return !(this.reason != finishMetadata.reason); } } @Serializable @SerialName("ExecutionMetadata") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B9\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\r\022\006\020\006\032\0020\007¢\006\002\020\rJ\t\020\022\032\0020\007HÆ\003J\023\020\023\032\0020\0002\b\b\002\020\006\032\0020\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\003HÖ\001J\t\020\031\032\0020\tHÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\020\020\021¨\006$"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$ExecutionMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "attributes", "Lai/grazie/utils/data/DataHolder;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lai/grazie/utils/data/DataHolder;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/data/DataHolder;)V", "getAttributes", "()Lai/grazie/utils/data/DataHolder;", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class ExecutionMetadata extends TaskData { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final DataHolder attributes; @NotNull private final String content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V3.TaskData.ExecutionMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$ExecutionMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<ExecutionMetadata> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V3.TaskData.ExecutionMetadata.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)DataHolderSerializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TaskAPI.Stream.V3.TaskData.ExecutionMetadata deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; DataHolder dataHolder = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V3.TaskData.ExecutionMetadata.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder); i |= 0x2; str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder); i |= 0x2; continue;case 2: str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.V3.TaskData.ExecutionMetadata(i, continuousSSEEventType, dataHolder, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V3.TaskData.ExecutionMetadata value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.V3.TaskData.ExecutionMetadata.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ExecutionMetadata", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("attributes", false); pluginGeneratedSerialDescriptor.addElement("content", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$ExecutionMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$ExecutionMetadata;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V3.TaskData.ExecutionMetadata> serializer() { return (KSerializer<TaskAPI.Stream.V3.TaskData.ExecutionMetadata>)TaskAPI.Stream.V3.TaskData.ExecutionMetadata.$serializer.INSTANCE; } } public ExecutionMetadata(@NotNull DataHolder attributes) { super(null); this.attributes = attributes; this.content = ""; } @NotNull public final DataHolder getAttributes() { return this.attributes; } @NotNull public String getContent() { return this.content; } @NotNull public final DataHolder component1() { return this.attributes; } @NotNull public final ExecutionMetadata copy(@NotNull DataHolder attributes) { Intrinsics.checkNotNullParameter(attributes, "attributes"); return new ExecutionMetadata(attributes); } @NotNull public String toString() { return "ExecutionMetadata(attributes=" + this.attributes + ")"; } public int hashCode() { return this.attributes.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof ExecutionMetadata)) return false;  ExecutionMetadata executionMetadata = (ExecutionMetadata)other; return !!Intrinsics.areEqual(this.attributes, executionMetadata.attributes); } } @Serializable @SerialName("FunctionCallMetadata") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B9\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\031\022\n\b\002\020\006\032\004\030\0010\007\022\006\020\b\032\0020\007¢\006\002\020\fJ\013\020\020\032\004\030\0010\007HÆ\003J\t\020\021\032\0020\007HÆ\003J\037\020\022\032\0020\0002\n\b\002\020\006\032\004\030\0010\0072\b\b\002\020\b\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\007HÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\024\020\b\032\0020\007X\004¢\006\b\n\000\032\004\b\r\020\016R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\017\020\016¨\006#"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FunctionCall;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "name", "", "content", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class FunctionCall extends TaskData { @NotNull public static final Companion Companion = new Companion(null); @Nullable private final String name; @NotNull private final String content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof FunctionCall)) return false;  FunctionCall functionCall = (FunctionCall)other; return !Intrinsics.areEqual(this.name, functionCall.name) ? false : (!!Intrinsics.areEqual(this.content, functionCall.content)); } public int hashCode() { result = (this.name == null) ? 0 : this.name.hashCode(); return result * 31 + this.content.hashCode(); } @NotNull public String toString() { return "FunctionCall(name=" + this.name + ", content=" + this.content + ")"; } @NotNull public final FunctionCall copy(@Nullable String name, @NotNull String content) { Intrinsics.checkNotNullParameter(content, "content"); return new FunctionCall(name, content); } @NotNull public final String component2() { return this.content; } @Nullable public final String component1() { return this.name; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V3.TaskData.FunctionCall.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FunctionCall;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<FunctionCall> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V3.TaskData.FunctionCall.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TaskAPI.Stream.V3.TaskData.FunctionCall deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; String str1 = null, str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V3.TaskData.FunctionCall.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x2; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x2; continue;case 2: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.V3.TaskData.FunctionCall(i, continuousSSEEventType, str1, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V3.TaskData.FunctionCall value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.V3.TaskData.FunctionCall.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FunctionCallMetadata", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("name", true); pluginGeneratedSerialDescriptor.addElement("content", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FunctionCall$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FunctionCall;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V3.TaskData.FunctionCall> serializer() { return (KSerializer<TaskAPI.Stream.V3.TaskData.FunctionCall>)TaskAPI.Stream.V3.TaskData.FunctionCall.$serializer.INSTANCE; } } @NotNull public String getContent() { return this.content; } @Nullable public final String getName() { return this.name; } public FunctionCall(@Nullable String name, @NotNull String content) { super(null); this.name = name; this.content = content; } } @Serializable @SerialName("UnknownMetadata") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\007\032\b\022\004\022\0020\0000\bHÆ\001R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$UnknownMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "serializer", "Lkotlinx/serialization/KSerializer;", "api-gateway-api"}) public static final class UnknownMetadata extends TaskData { @NotNull public final KSerializer<UnknownMetadata> serializer() { return get$cachedSerializer(); } private UnknownMetadata() { super(null); } @NotNull private static final String content = ""; @NotNull public static final UnknownMetadata INSTANCE = new UnknownMetadata(); @NotNull public String getContent() { return content; } } } @Serializable @SerialName("UnknownMetadata") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\007\032\b\022\004\022\0020\0000\bHÆ\001R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$UnknownMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "serializer", "Lkotlinx/serialization/KSerializer;", "api-gateway-api"}) public static final class UnknownMetadata extends TaskData { @NotNull public final KSerializer<UnknownMetadata> serializer() { return get$cachedSerializer(); } private UnknownMetadata() { super(null); } @NotNull private static final String content = ""; @NotNull public static final UnknownMetadata INSTANCE = new UnknownMetadata(); @NotNull public String getContent() { return content; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskDataSerializer;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEventSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData;", "()V", "api-gateway-api"}) public static final class TaskDataSerializer extends ContinuousSSEEventSerializer<TaskData> { @NotNull public static final TaskDataSerializer INSTANCE = new TaskDataSerializer(); private TaskDataSerializer() { super(Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.class), TaskAPI.Stream.V3.TaskData.Companion.serializer(), TaskAPI.Stream.V3.TaskData.UnknownMetadata.INSTANCE.serializer()); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\003\030\031\032B\r\022\006\020\004\032\0020\005¢\006\002\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\013\032\0020\005X\004¢\006\b\n\000\032\004\b\f\020\rR\032\020\016\032\b\022\004\022\0020\0020\017X\004¢\006\b\n\000\032\004\b\020\020\021R\032\020\022\032\b\022\004\022\0020\0030\017X\004¢\006\b\n\000\032\004\b\023\020\021R\024\020\024\032\0020\025X\004¢\006\b\n\000\032\004\b\026\020\027¨\006\033"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$Request;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData;", "taskNameParam", "", "(Ljava/lang/String;)V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "sseConfig", "Lai/grazie/model/cloud/SseConfig;", "getSseConfig", "()Lai/grazie/model/cloud/SseConfig;", "Request", "TaskData", "TaskDataSerializer", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nTaskAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskAPI.kt\nai/grazie/api/gateway/api/task/TaskAPI$Stream$V4\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,217:1\n19#2,2:218\n19#2,2:220\n*S KotlinDebug\n*F\n+ 1 TaskAPI.kt\nai/grazie/api/gateway/api/task/TaskAPI$Stream$V4\n*L\n143#1:218,2\n144#1:220,2\n*E\n"}) public static final class V4 implements TypedApi<V4.Request, V4.TaskData> { public V4(@NotNull String taskNameParam) { this.path = "/task/stream/v4/" + taskNameParam; this.httpMethod = HttpMethod.Post; this.sseConfig = new SseConfig(Reflection.getOrCreateKotlinClass(TaskData.UnknownMetadata.class)); int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Request.class); this.requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0; kType$iv = Reflection.typeOf(TaskData.class); this.responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(TaskData.class)); }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     private final String path;
/*     */     @NotNull
/*     */     private final HttpMethod httpMethod;
/*     */     @NotNull
/*     */     private final SseConfig sseConfig;
/*     */     @NotNull
/*     */     private final TypeInfo<Request> requestType;
/*     */     @NotNull
/*     */     private final TypeInfo<TaskData> responseType;
/*     */     
/*     */     @NotNull
/*     */     public String getPath() {
/*     */       return this.path;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public HttpMethod getHttpMethod() {
/*     */       return this.httpMethod;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public SseConfig getSseConfig() {
/*     */       return this.sseConfig;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public TypeInfo<Request> getRequestType() {
/*     */       return this.requestType;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public TypeInfo<TaskData> getResponseType() {
/*     */       return this.responseType;
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$Request;", "", "seen1", "", "parameters", "Lai/grazie/utils/data/DataHolder;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/data/DataHolder;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/data/DataHolder;)V", "getParameters", "()Lai/grazie/utils/data/DataHolder;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */     public static final class Request {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @NotNull
/*     */       private final DataHolder parameters;
/*     */       
/*     */       public Request(@NotNull DataHolder parameters) {
/*     */         this.parameters = parameters;
/*     */       }
/*     */       
/*     */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V4.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */       public static final class $serializer implements GeneratedSerializer<Request> {
/*     */         @NotNull
/*     */         public static final $serializer INSTANCE = new $serializer();
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] typeParametersSerializers() {
/*     */           return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public SerialDescriptor getDescriptor() {
/*     */           return (SerialDescriptor)descriptor;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] childSerializers() {
/*     */           KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*     */           arrayOfKSerializer[0] = (KSerializer)DataHolderSerializer.INSTANCE;
/*     */           return (KSerializer<?>[])arrayOfKSerializer;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public TaskAPI.Stream.V4.Request deserialize(@NotNull Decoder decoder) {
/*     */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           boolean bool = true;
/*     */           int i = 0;
/*     */           DataHolder dataHolder = null;
/*     */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */           if (compositeDecoder.decodeSequentially()) {
/*     */             dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder);
/*     */             i |= 0x1;
/*     */           } else {
/*     */             while (bool) {
/*     */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */               switch (j) {
/*     */                 case -1:
/*     */                   bool = false;
/*     */                   continue;
/*     */                 case 0:
/*     */                   dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder);
/*     */                   i |= 0x1;
/*     */                   continue;
/*     */               } 
/*     */               throw new UnknownFieldException(j);
/*     */             } 
/*     */           } 
/*     */           compositeDecoder.endStructure(serialDescriptor);
/*     */           return new TaskAPI.Stream.V4.Request(i, dataHolder, null);
/*     */         }
/*     */         
/*     */         public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V4.Request value) {
/*     */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */           Intrinsics.checkNotNullParameter(value, "value");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */           TaskAPI.Stream.V4.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */           compositeEncoder.endStructure(serialDescriptor);
/*     */         }
/*     */         
/*     */         static {
/*     */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.task.TaskAPI.Stream.V4.Request", INSTANCE, 1);
/*     */           pluginGeneratedSerialDescriptor.addElement("parameters", false);
/*     */           descriptor = pluginGeneratedSerialDescriptor;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$Request;", "api-gateway-api"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<TaskAPI.Stream.V4.Request> serializer() {
/*     */           return (KSerializer<TaskAPI.Stream.V4.Request>)TaskAPI.Stream.V4.Request.$serializer.INSTANCE;
/*     */         }
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final DataHolder getParameters() {
/*     */         return this.parameters;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final DataHolder component1() {
/*     */         return this.parameters;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Request copy(@NotNull DataHolder parameters) {
/*     */         Intrinsics.checkNotNullParameter(parameters, "parameters");
/*     */         return new Request(parameters);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "Request(parameters=" + this.parameters + ")";
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return this.parameters.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof Request))
/*     */           return false; 
/*     */         Request request = (Request)other;
/*     */         return !!Intrinsics.areEqual(this.parameters, request.parameters);
/*     */       }
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\000 \0252\0020\001:\007\025\026\027\030\031\032\033B%\b\027\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\007\b\004¢\006\002\020\tJ!\020\016\032\0020\0172\006\020\020\032\0020\0002\006\020\021\032\0020\0222\006\020\023\032\0020\024HÇ\001R\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\r\001\006\034\035\036\037 !¨\006\""}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData;", "Lai/grazie/model/cloud/sse/continuous/Data;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "content", "", "getContent", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Content", "ExecutionMetadata", "FinishMetadata", "FunctionCall", "QuotaMetadata", "UnknownMetadata", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$Content;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$ExecutionMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$FinishMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$FunctionCall;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$QuotaMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$UnknownMetadata;", "api-gateway-api"})
/*     */     public static abstract class TaskData extends Data {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @JvmField
/*     */       @NotNull
/*     */       private static final KSerializer<Object>[] $childSerializers;
/*     */       @NotNull
/*     */       private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE);
/*     */       
/*     */       static {
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*     */         arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer();
/*     */         $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public abstract String getContent();
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */       static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*     */         public static final null INSTANCE = (null)new Function0<>();
/*     */         
/*     */         null() {
/*     */           super(0);
/*     */         }
/*     */         
/*     */         public final KSerializer<Object> invoke() {
/*     */           KClass[] arrayOfKClass = new KClass[6];
/*     */           arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V4.TaskData.Content.class);
/*     */           arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V4.TaskData.ExecutionMetadata.class);
/*     */           arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V4.TaskData.FinishMetadata.class);
/*     */           arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V4.TaskData.FunctionCall.class);
/*     */           arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V4.TaskData.QuotaMetadata.class);
/*     */           arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V4.TaskData.UnknownMetadata.class);
/*     */           KSerializer[] arrayOfKSerializer = new KSerializer[6];
/*     */           arrayOfKSerializer[0] = (KSerializer)TaskAPI.Stream.V4.TaskData.Content.$serializer.INSTANCE;
/*     */           arrayOfKSerializer[1] = (KSerializer)TaskAPI.Stream.V4.TaskData.ExecutionMetadata.$serializer.INSTANCE;
/*     */           arrayOfKSerializer[2] = (KSerializer)TaskAPI.Stream.V4.TaskData.FinishMetadata.$serializer.INSTANCE;
/*     */           arrayOfKSerializer[3] = (KSerializer)TaskAPI.Stream.V4.TaskData.FunctionCall.$serializer.INSTANCE;
/*     */           arrayOfKSerializer[4] = (KSerializer)TaskAPI.Stream.V4.TaskData.QuotaMetadata.$serializer.INSTANCE;
/*     */           arrayOfKSerializer[5] = (KSerializer)new ObjectSerializer("UnknownMetadata", TaskAPI.Stream.V4.TaskData.UnknownMetadata.INSTANCE, new java.lang.annotation.Annotation[0]);
/*     */           return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.api.gateway.api.task.TaskAPI.Stream.V4.TaskData", Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V4.TaskData.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData;", "api-gateway-api"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<TaskAPI.Stream.V4.TaskData> serializer() {
/*     */           return get$cachedSerializer();
/*     */         }
/*     */       }
/*     */       
/*     */       private TaskData() {}
/*     */       
/*     */       @Serializable
/*     */       @SerialName("Content")
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\036\037B/\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\r\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\016\032\0020\007HÆ\003J\023\020\017\032\0020\0002\b\b\002\020\006\032\0020\007HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\003HÖ\001J\t\020\025\032\0020\007HÖ\001J&\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034HÁ\001¢\006\002\b\035R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\f\020\r¨\006 "}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$Content;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */       public static final class Content extends TaskData {
/*     */         @NotNull
/*     */         public static final Companion Companion = new Companion(null);
/*     */         @NotNull
/*     */         private final String content;
/*     */         @JvmField
/*     */         @NotNull
/*     */         private static final KSerializer<Object>[] $childSerializers;
/*     */         
/*     */         static {
/*     */           KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*     */           arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer();
/*     */           arrayOfKSerializer[1] = null;
/*     */           $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */         }
/*     */         
/*     */         public boolean equals(@Nullable Object other) {
/*     */           if (this == other)
/*     */             return true; 
/*     */           if (!(other instanceof Content))
/*     */             return false; 
/*     */           Content content = (Content)other;
/*     */           return !!Intrinsics.areEqual(this.content, content.content);
/*     */         }
/*     */         
/*     */         public int hashCode() {
/*     */           return this.content.hashCode();
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public String toString() {
/*     */           return "Content(content=" + this.content + ")";
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final Content copy(@NotNull String content) {
/*     */           Intrinsics.checkNotNullParameter(content, "content");
/*     */           return new Content(content);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final String component1() {
/*     */           return this.content;
/*     */         }
/*     */         
/*     */         @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V4.TaskData.Content.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$Content;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */         public static final class $serializer implements GeneratedSerializer<Content> {
/*     */           @NotNull
/*     */           public static final $serializer INSTANCE = new $serializer();
/*     */           
/*     */           @NotNull
/*     */           public KSerializer<?>[] typeParametersSerializers() {
/*     */             return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public SerialDescriptor getDescriptor() {
/*     */             return (SerialDescriptor)descriptor;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public KSerializer<?>[] childSerializers() {
/*     */             KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V4.TaskData.Content.$childSerializers, arrayOfKSerializer2 = new KSerializer[2];
/*     */             arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */             arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*     */             return (KSerializer<?>[])arrayOfKSerializer2;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public TaskAPI.Stream.V4.TaskData.Content deserialize(@NotNull Decoder decoder) {
/*     */             Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             boolean bool = true;
/*     */             int i = 0;
/*     */             ContinuousSSEEventType continuousSSEEventType = null;
/*     */             String str = null;
/*     */             CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */             KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V4.TaskData.Content.$childSerializers;
/*     */             if (compositeDecoder.decodeSequentially()) {
/*     */               continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */               i |= 0x1;
/*     */               str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */               i |= 0x2;
/*     */             } else {
/*     */               while (bool) {
/*     */                 int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */                 switch (j) {
/*     */                   case -1:
/*     */                     bool = false;
/*     */                     continue;
/*     */                   case 0:
/*     */                     continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */                     i |= 0x1;
/*     */                     continue;
/*     */                   case 1:
/*     */                     str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */                     i |= 0x2;
/*     */                     continue;
/*     */                 } 
/*     */                 throw new UnknownFieldException(j);
/*     */               } 
/*     */             } 
/*     */             compositeDecoder.endStructure(serialDescriptor);
/*     */             return new TaskAPI.Stream.V4.TaskData.Content(i, continuousSSEEventType, str, null);
/*     */           }
/*     */           
/*     */           public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V4.TaskData.Content value) {
/*     */             Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */             Intrinsics.checkNotNullParameter(value, "value");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */             TaskAPI.Stream.V4.TaskData.Content.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */             compositeEncoder.endStructure(serialDescriptor);
/*     */           }
/*     */           
/*     */           static {
/*     */             PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Content", INSTANCE, 2);
/*     */             pluginGeneratedSerialDescriptor.addElement("event_type", true);
/*     */             pluginGeneratedSerialDescriptor.addElement("content", false);
/*     */             descriptor = pluginGeneratedSerialDescriptor;
/*     */           }
/*     */         }
/*     */         
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$Content$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$Content;", "api-gateway-api"})
/*     */         public static final class Companion {
/*     */           private Companion() {}
/*     */           
/*     */           @NotNull
/*     */           public final KSerializer<TaskAPI.Stream.V4.TaskData.Content> serializer() {
/*     */             return (KSerializer<TaskAPI.Stream.V4.TaskData.Content>)TaskAPI.Stream.V4.TaskData.Content.$serializer.INSTANCE;
/*     */           }
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public String getContent() {
/*     */           return this.content;
/*     */         }
/*     */         
/*     */         public Content(@NotNull String content) {
/*     */           super(null);
/*     */           this.content = content;
/*     */         }
/*     */       }
/*     */       
/*     */       @Serializable
/*     */       @SerialName("QuotaMetadata")
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(BC\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B\025\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\017J\t\020\026\032\0020\007HÆ\003J\t\020\027\032\0020\tHÆ\003J\035\020\030\032\0020\0002\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\034HÖ\003J\t\020\035\032\0020\003HÖ\001J\t\020\036\032\0020\013HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\024\020\n\032\0020\013XD¢\006\b\n\000\032\004\b\020\020\021R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025¨\006)"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$QuotaMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "updated", "Lai/grazie/quota/Quota;", "spent", "Lai/grazie/utils/mpp/money/Credit;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;)V", "getContent", "()Ljava/lang/String;", "getSpent", "()Lai/grazie/utils/mpp/money/Credit;", "getUpdated", "()Lai/grazie/quota/Quota;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */       public static final class QuotaMetadata extends TaskData {
/*     */         @NotNull
/*     */         public static final Companion Companion = new Companion(null);
/*     */         @NotNull
/*     */         private final Quota updated;
/*     */         @NotNull
/*     */         private final Credit spent;
/*     */         @NotNull
/*     */         private final String content;
/*     */         @JvmField
/*     */         @NotNull
/*     */         private static final KSerializer<Object>[] $childSerializers;
/*     */         
/*     */         static {
/*     */           KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*     */           arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer();
/*     */           arrayOfKSerializer[1] = null;
/*     */           arrayOfKSerializer[2] = null;
/*     */           arrayOfKSerializer[3] = null;
/*     */           $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */         }
/*     */         
/*     */         @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V4.TaskData.QuotaMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$QuotaMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */         public static final class $serializer implements GeneratedSerializer<QuotaMetadata> {
/*     */           @NotNull
/*     */           public static final $serializer INSTANCE = new $serializer();
/*     */           
/*     */           @NotNull
/*     */           public KSerializer<?>[] typeParametersSerializers() {
/*     */             return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public SerialDescriptor getDescriptor() {
/*     */             return (SerialDescriptor)descriptor;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public KSerializer<?>[] childSerializers() {
/*     */             KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V4.TaskData.QuotaMetadata.$childSerializers, arrayOfKSerializer2 = new KSerializer[4];
/*     */             arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */             arrayOfKSerializer2[1] = (KSerializer)Quota$.serializer.INSTANCE;
/*     */             arrayOfKSerializer2[2] = (KSerializer)Credit$.serializer.INSTANCE;
/*     */             arrayOfKSerializer2[3] = (KSerializer)StringSerializer.INSTANCE;
/*     */             return (KSerializer<?>[])arrayOfKSerializer2;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public TaskAPI.Stream.V4.TaskData.QuotaMetadata deserialize(@NotNull Decoder decoder) {
/*     */             Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             boolean bool = true;
/*     */             int i = 0;
/*     */             ContinuousSSEEventType continuousSSEEventType = null;
/*     */             Quota quota = null;
/*     */             Credit credit = null;
/*     */             String str = null;
/*     */             CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */             KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V4.TaskData.QuotaMetadata.$childSerializers;
/*     */             if (compositeDecoder.decodeSequentially()) {
/*     */               continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */               i |= 0x1;
/*     */               quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota);
/*     */               i |= 0x2;
/*     */               credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit);
/*     */               i |= 0x4;
/*     */               str = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*     */               i |= 0x8;
/*     */             } else {
/*     */               while (bool) {
/*     */                 int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */                 switch (j) {
/*     */                   case -1:
/*     */                     bool = false;
/*     */                     continue;
/*     */                   case 0:
/*     */                     continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */                     i |= 0x1;
/*     */                     continue;
/*     */                   case 1:
/*     */                     quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota);
/*     */                     i |= 0x2;
/*     */                     continue;
/*     */                   case 2:
/*     */                     credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit);
/*     */                     i |= 0x4;
/*     */                     continue;
/*     */                   case 3:
/*     */                     str = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*     */                     i |= 0x8;
/*     */                     continue;
/*     */                 } 
/*     */                 throw new UnknownFieldException(j);
/*     */               } 
/*     */             } 
/*     */             compositeDecoder.endStructure(serialDescriptor);
/*     */             return new TaskAPI.Stream.V4.TaskData.QuotaMetadata(i, continuousSSEEventType, quota, credit, str, null);
/*     */           }
/*     */           
/*     */           public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V4.TaskData.QuotaMetadata value) {
/*     */             Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */             Intrinsics.checkNotNullParameter(value, "value");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */             TaskAPI.Stream.V4.TaskData.QuotaMetadata.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */             compositeEncoder.endStructure(serialDescriptor);
/*     */           }
/*     */           
/*     */           static {
/*     */             PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("QuotaMetadata", INSTANCE, 4);
/*     */             pluginGeneratedSerialDescriptor.addElement("event_type", true);
/*     */             pluginGeneratedSerialDescriptor.addElement("updated", false);
/*     */             pluginGeneratedSerialDescriptor.addElement("spent", false);
/*     */             pluginGeneratedSerialDescriptor.addElement("content", true);
/*     */             descriptor = pluginGeneratedSerialDescriptor;
/*     */           }
/*     */         }
/*     */         
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$QuotaMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$QuotaMetadata;", "api-gateway-api"})
/*     */         public static final class Companion {
/*     */           private Companion() {}
/*     */           
/*     */           @NotNull
/*     */           public final KSerializer<TaskAPI.Stream.V4.TaskData.QuotaMetadata> serializer() {
/*     */             return (KSerializer<TaskAPI.Stream.V4.TaskData.QuotaMetadata>)TaskAPI.Stream.V4.TaskData.QuotaMetadata.$serializer.INSTANCE;
/*     */           }
/*     */         }
/*     */         
/*     */         public QuotaMetadata(@NotNull Quota updated, @NotNull Credit spent) {
/*     */           super(null);
/*     */           this.updated = updated;
/*     */           this.spent = spent;
/*     */           this.content = "";
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final Quota getUpdated() {
/*     */           return this.updated;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final Credit getSpent() {
/*     */           return this.spent;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public String getContent() {
/*     */           return this.content;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final Quota component1() {
/*     */           return this.updated;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final Credit component2() {
/*     */           return this.spent;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final QuotaMetadata copy(@NotNull Quota updated, @NotNull Credit spent) {
/*     */           Intrinsics.checkNotNullParameter(updated, "updated");
/*     */           Intrinsics.checkNotNullParameter(spent, "spent");
/*     */           return new QuotaMetadata(updated, spent);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public String toString() {
/*     */           return "QuotaMetadata(updated=" + this.updated + ", spent=" + this.spent + ")";
/*     */         }
/*     */         
/*     */         public int hashCode() {
/*     */           result = this.updated.hashCode();
/*     */           return result * 31 + this.spent.hashCode();
/*     */         }
/*     */         
/*     */         public boolean equals(@Nullable Object other) {
/*     */           if (this == other)
/*     */             return true; 
/*     */           if (!(other instanceof QuotaMetadata))
/*     */             return false; 
/*     */           QuotaMetadata quotaMetadata = (QuotaMetadata)other;
/*     */           return !Intrinsics.areEqual(this.updated, quotaMetadata.updated) ? false : (!!Intrinsics.areEqual(this.spent, quotaMetadata.spent));
/*     */         }
/*     */       }
/*     */       
/*     */       @Serializable
/*     */       @SerialName("FinishMetadata")
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B9\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\r\022\006\020\006\032\0020\007¢\006\002\020\rJ\t\020\022\032\0020\007HÆ\003J\023\020\023\032\0020\0002\b\b\002\020\006\032\0020\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\003HÖ\001J\t\020\031\032\0020\tHÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021¨\006$"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$FinishMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "reason", "Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;)V", "getContent", "()Ljava/lang/String;", "getReason", "()Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */       public static final class FinishMetadata extends TaskData {
/*     */         @NotNull
/*     */         public static final Companion Companion = new Companion(null);
/*     */         @NotNull
/*     */         private final LLMStreamFinishReason reason;
/*     */         @NotNull
/*     */         private final String content;
/*     */         @JvmField
/*     */         @NotNull
/*     */         private static final KSerializer<Object>[] $childSerializers;
/*     */         
/*     */         static {
/*     */           KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*     */           arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer();
/*     */           arrayOfKSerializer[1] = null;
/*     */           arrayOfKSerializer[2] = null;
/*     */           $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */         }
/*     */         
/*     */         @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V4.TaskData.FinishMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$FinishMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */         public static final class $serializer implements GeneratedSerializer<FinishMetadata> {
/*     */           @NotNull
/*     */           public static final $serializer INSTANCE = new $serializer();
/*     */           
/*     */           @NotNull
/*     */           public KSerializer<?>[] typeParametersSerializers() {
/*     */             return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public SerialDescriptor getDescriptor() {
/*     */             return (SerialDescriptor)descriptor;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public KSerializer<?>[] childSerializers() {
/*     */             KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V4.TaskData.FinishMetadata.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*     */             arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */             arrayOfKSerializer2[1] = (KSerializer)LLMStreamFinishReason.Serializer.INSTANCE;
/*     */             arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE;
/*     */             return (KSerializer<?>[])arrayOfKSerializer2;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public TaskAPI.Stream.V4.TaskData.FinishMetadata deserialize(@NotNull Decoder decoder) {
/*     */             Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             boolean bool = true;
/*     */             int i = 0;
/*     */             ContinuousSSEEventType continuousSSEEventType = null;
/*     */             LLMStreamFinishReason lLMStreamFinishReason = null;
/*     */             String str = null;
/*     */             CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */             KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V4.TaskData.FinishMetadata.$childSerializers;
/*     */             if (compositeDecoder.decodeSequentially()) {
/*     */               continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */               i |= 0x1;
/*     */               lLMStreamFinishReason = (LLMStreamFinishReason)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMStreamFinishReason.Serializer.INSTANCE, lLMStreamFinishReason);
/*     */               i |= 0x2;
/*     */               str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */               i |= 0x4;
/*     */             } else {
/*     */               while (bool) {
/*     */                 int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */                 switch (j) {
/*     */                   case -1:
/*     */                     bool = false;
/*     */                     continue;
/*     */                   case 0:
/*     */                     continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */                     i |= 0x1;
/*     */                     continue;
/*     */                   case 1:
/*     */                     lLMStreamFinishReason = (LLMStreamFinishReason)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMStreamFinishReason.Serializer.INSTANCE, lLMStreamFinishReason);
/*     */                     i |= 0x2;
/*     */                     continue;
/*     */                   case 2:
/*     */                     str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */                     i |= 0x4;
/*     */                     continue;
/*     */                 } 
/*     */                 throw new UnknownFieldException(j);
/*     */               } 
/*     */             } 
/*     */             compositeDecoder.endStructure(serialDescriptor);
/*     */             return new TaskAPI.Stream.V4.TaskData.FinishMetadata(i, continuousSSEEventType, lLMStreamFinishReason, str, null);
/*     */           }
/*     */           
/*     */           public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V4.TaskData.FinishMetadata value) {
/*     */             Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */             Intrinsics.checkNotNullParameter(value, "value");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */             TaskAPI.Stream.V4.TaskData.FinishMetadata.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */             compositeEncoder.endStructure(serialDescriptor);
/*     */           }
/*     */           
/*     */           static {
/*     */             PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FinishMetadata", INSTANCE, 3);
/*     */             pluginGeneratedSerialDescriptor.addElement("event_type", true);
/*     */             pluginGeneratedSerialDescriptor.addElement("reason", false);
/*     */             pluginGeneratedSerialDescriptor.addElement("content", true);
/*     */             descriptor = pluginGeneratedSerialDescriptor;
/*     */           }
/*     */         }
/*     */         
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$FinishMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$FinishMetadata;", "api-gateway-api"})
/*     */         public static final class Companion {
/*     */           private Companion() {}
/*     */           
/*     */           @NotNull
/*     */           public final KSerializer<TaskAPI.Stream.V4.TaskData.FinishMetadata> serializer() {
/*     */             return (KSerializer<TaskAPI.Stream.V4.TaskData.FinishMetadata>)TaskAPI.Stream.V4.TaskData.FinishMetadata.$serializer.INSTANCE;
/*     */           }
/*     */         }
/*     */         
/*     */         public FinishMetadata(@NotNull LLMStreamFinishReason reason) {
/*     */           super(null);
/*     */           this.reason = reason;
/*     */           this.content = "";
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final LLMStreamFinishReason getReason() {
/*     */           return this.reason;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public String getContent() {
/*     */           return this.content;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final LLMStreamFinishReason component1() {
/*     */           return this.reason;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final FinishMetadata copy(@NotNull LLMStreamFinishReason reason) {
/*     */           Intrinsics.checkNotNullParameter(reason, "reason");
/*     */           return new FinishMetadata(reason);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public String toString() {
/*     */           return "FinishMetadata(reason=" + this.reason + ")";
/*     */         }
/*     */         
/*     */         public int hashCode() {
/*     */           return this.reason.hashCode();
/*     */         }
/*     */         
/*     */         public boolean equals(@Nullable Object other) {
/*     */           if (this == other)
/*     */             return true; 
/*     */           if (!(other instanceof FinishMetadata))
/*     */             return false; 
/*     */           FinishMetadata finishMetadata = (FinishMetadata)other;
/*     */           return !(this.reason != finishMetadata.reason);
/*     */         }
/*     */       }
/*     */       
/*     */       @Serializable
/*     */       @SerialName("ExecutionMetadata")
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B9\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\r\022\006\020\006\032\0020\007¢\006\002\020\rJ\t\020\022\032\0020\007HÆ\003J\023\020\023\032\0020\0002\b\b\002\020\006\032\0020\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\003HÖ\001J\t\020\031\032\0020\tHÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\020\020\021¨\006$"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$ExecutionMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "attributes", "Lai/grazie/utils/data/DataHolder;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lai/grazie/utils/data/DataHolder;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/data/DataHolder;)V", "getAttributes", "()Lai/grazie/utils/data/DataHolder;", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */       public static final class ExecutionMetadata extends TaskData {
/*     */         @NotNull
/*     */         public static final Companion Companion = new Companion(null);
/*     */         @NotNull
/*     */         private final DataHolder attributes;
/*     */         @NotNull
/*     */         private final String content;
/*     */         @JvmField
/*     */         @NotNull
/*     */         private static final KSerializer<Object>[] $childSerializers;
/*     */         
/*     */         static {
/*     */           KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*     */           arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer();
/*     */           arrayOfKSerializer[1] = null;
/*     */           arrayOfKSerializer[2] = null;
/*     */           $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */         }
/*     */         
/*     */         @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V4.TaskData.ExecutionMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$ExecutionMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */         public static final class $serializer implements GeneratedSerializer<ExecutionMetadata> {
/*     */           @NotNull
/*     */           public static final $serializer INSTANCE = new $serializer();
/*     */           
/*     */           @NotNull
/*     */           public KSerializer<?>[] typeParametersSerializers() {
/*     */             return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public SerialDescriptor getDescriptor() {
/*     */             return (SerialDescriptor)descriptor;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public KSerializer<?>[] childSerializers() {
/*     */             KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V4.TaskData.ExecutionMetadata.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*     */             arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */             arrayOfKSerializer2[1] = (KSerializer)DataHolderSerializer.INSTANCE;
/*     */             arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE;
/*     */             return (KSerializer<?>[])arrayOfKSerializer2;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public TaskAPI.Stream.V4.TaskData.ExecutionMetadata deserialize(@NotNull Decoder decoder) {
/*     */             Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             boolean bool = true;
/*     */             int i = 0;
/*     */             ContinuousSSEEventType continuousSSEEventType = null;
/*     */             DataHolder dataHolder = null;
/*     */             String str = null;
/*     */             CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */             KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V4.TaskData.ExecutionMetadata.$childSerializers;
/*     */             if (compositeDecoder.decodeSequentially()) {
/*     */               continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */               i |= 0x1;
/*     */               dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder);
/*     */               i |= 0x2;
/*     */               str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */               i |= 0x4;
/*     */             } else {
/*     */               while (bool) {
/*     */                 int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */                 switch (j) {
/*     */                   case -1:
/*     */                     bool = false;
/*     */                     continue;
/*     */                   case 0:
/*     */                     continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */                     i |= 0x1;
/*     */                     continue;
/*     */                   case 1:
/*     */                     dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder);
/*     */                     i |= 0x2;
/*     */                     continue;
/*     */                   case 2:
/*     */                     str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */                     i |= 0x4;
/*     */                     continue;
/*     */                 } 
/*     */                 throw new UnknownFieldException(j);
/*     */               } 
/*     */             } 
/*     */             compositeDecoder.endStructure(serialDescriptor);
/*     */             return new TaskAPI.Stream.V4.TaskData.ExecutionMetadata(i, continuousSSEEventType, dataHolder, str, null);
/*     */           }
/*     */           
/*     */           public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V4.TaskData.ExecutionMetadata value) {
/*     */             Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */             Intrinsics.checkNotNullParameter(value, "value");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */             TaskAPI.Stream.V4.TaskData.ExecutionMetadata.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */             compositeEncoder.endStructure(serialDescriptor);
/*     */           }
/*     */           
/*     */           static {
/*     */             PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ExecutionMetadata", INSTANCE, 3);
/*     */             pluginGeneratedSerialDescriptor.addElement("event_type", true);
/*     */             pluginGeneratedSerialDescriptor.addElement("attributes", false);
/*     */             pluginGeneratedSerialDescriptor.addElement("content", true);
/*     */             descriptor = pluginGeneratedSerialDescriptor;
/*     */           }
/*     */         }
/*     */         
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$ExecutionMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$ExecutionMetadata;", "api-gateway-api"})
/*     */         public static final class Companion {
/*     */           private Companion() {}
/*     */           
/*     */           @NotNull
/*     */           public final KSerializer<TaskAPI.Stream.V4.TaskData.ExecutionMetadata> serializer() {
/*     */             return (KSerializer<TaskAPI.Stream.V4.TaskData.ExecutionMetadata>)TaskAPI.Stream.V4.TaskData.ExecutionMetadata.$serializer.INSTANCE;
/*     */           }
/*     */         }
/*     */         
/*     */         public ExecutionMetadata(@NotNull DataHolder attributes) {
/*     */           super(null);
/*     */           this.attributes = attributes;
/*     */           this.content = "";
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final DataHolder getAttributes() {
/*     */           return this.attributes;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public String getContent() {
/*     */           return this.content;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final DataHolder component1() {
/*     */           return this.attributes;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final ExecutionMetadata copy(@NotNull DataHolder attributes) {
/*     */           Intrinsics.checkNotNullParameter(attributes, "attributes");
/*     */           return new ExecutionMetadata(attributes);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public String toString() {
/*     */           return "ExecutionMetadata(attributes=" + this.attributes + ")";
/*     */         }
/*     */         
/*     */         public int hashCode() {
/*     */           return this.attributes.hashCode();
/*     */         }
/*     */         
/*     */         public boolean equals(@Nullable Object other) {
/*     */           if (this == other)
/*     */             return true; 
/*     */           if (!(other instanceof ExecutionMetadata))
/*     */             return false; 
/*     */           ExecutionMetadata executionMetadata = (ExecutionMetadata)other;
/*     */           return !!Intrinsics.areEqual(this.attributes, executionMetadata.attributes);
/*     */         }
/*     */       }
/*     */       
/*     */       @Serializable
/*     */       @SerialName("FunctionCallMetadata")
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B9\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\031\022\n\b\002\020\006\032\004\030\0010\007\022\006\020\b\032\0020\007¢\006\002\020\fJ\013\020\020\032\004\030\0010\007HÆ\003J\t\020\021\032\0020\007HÆ\003J\037\020\022\032\0020\0002\n\b\002\020\006\032\004\030\0010\0072\b\b\002\020\b\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\007HÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\024\020\b\032\0020\007X\004¢\006\b\n\000\032\004\b\r\020\016R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\017\020\016¨\006#"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$FunctionCall;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "name", "", "content", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */       public static final class FunctionCall extends TaskData {
/*     */         @NotNull
/*     */         public static final Companion Companion = new Companion(null);
/*     */         @Nullable
/*     */         private final String name;
/*     */         @NotNull
/*     */         private final String content;
/*     */         @JvmField
/*     */         @NotNull
/*     */         private static final KSerializer<Object>[] $childSerializers;
/*     */         
/*     */         static {
/*     */           KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*     */           arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer();
/*     */           arrayOfKSerializer[1] = null;
/*     */           arrayOfKSerializer[2] = null;
/*     */           $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */         }
/*     */         
/*     */         public boolean equals(@Nullable Object other) {
/*     */           if (this == other)
/*     */             return true; 
/*     */           if (!(other instanceof FunctionCall))
/*     */             return false; 
/*     */           FunctionCall functionCall = (FunctionCall)other;
/*     */           return !Intrinsics.areEqual(this.name, functionCall.name) ? false : (!!Intrinsics.areEqual(this.content, functionCall.content));
/*     */         }
/*     */         
/*     */         public int hashCode() {
/*     */           result = (this.name == null) ? 0 : this.name.hashCode();
/*     */           return result * 31 + this.content.hashCode();
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public String toString() {
/*     */           return "FunctionCall(name=" + this.name + ", content=" + this.content + ")";
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final FunctionCall copy(@Nullable String name, @NotNull String content) {
/*     */           Intrinsics.checkNotNullParameter(content, "content");
/*     */           return new FunctionCall(name, content);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final String component2() {
/*     */           return this.content;
/*     */         }
/*     */         
/*     */         @Nullable
/*     */         public final String component1() {
/*     */           return this.name;
/*     */         }
/*     */         
/*     */         @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V4.TaskData.FunctionCall.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$FunctionCall;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */         public static final class $serializer implements GeneratedSerializer<FunctionCall> {
/*     */           @NotNull
/*     */           public static final $serializer INSTANCE = new $serializer();
/*     */           
/*     */           @NotNull
/*     */           public KSerializer<?>[] typeParametersSerializers() {
/*     */             return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public SerialDescriptor getDescriptor() {
/*     */             return (SerialDescriptor)descriptor;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public KSerializer<?>[] childSerializers() {
/*     */             KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V4.TaskData.FunctionCall.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*     */             arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */             arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*     */             arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE;
/*     */             return (KSerializer<?>[])arrayOfKSerializer2;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public TaskAPI.Stream.V4.TaskData.FunctionCall deserialize(@NotNull Decoder decoder) {
/*     */             Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             boolean bool = true;
/*     */             int i = 0;
/*     */             ContinuousSSEEventType continuousSSEEventType = null;
/*     */             String str1 = null, str2 = null;
/*     */             CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */             KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V4.TaskData.FunctionCall.$childSerializers;
/*     */             if (compositeDecoder.decodeSequentially()) {
/*     */               continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */               i |= 0x1;
/*     */               str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1);
/*     */               i |= 0x2;
/*     */               str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */               i |= 0x4;
/*     */             } else {
/*     */               while (bool) {
/*     */                 int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */                 switch (j) {
/*     */                   case -1:
/*     */                     bool = false;
/*     */                     continue;
/*     */                   case 0:
/*     */                     continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */                     i |= 0x1;
/*     */                     continue;
/*     */                   case 1:
/*     */                     str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1);
/*     */                     i |= 0x2;
/*     */                     continue;
/*     */                   case 2:
/*     */                     str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */                     i |= 0x4;
/*     */                     continue;
/*     */                 } 
/*     */                 throw new UnknownFieldException(j);
/*     */               } 
/*     */             } 
/*     */             compositeDecoder.endStructure(serialDescriptor);
/*     */             return new TaskAPI.Stream.V4.TaskData.FunctionCall(i, continuousSSEEventType, str1, str2, null);
/*     */           }
/*     */           
/*     */           public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V4.TaskData.FunctionCall value) {
/*     */             Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */             Intrinsics.checkNotNullParameter(value, "value");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */             TaskAPI.Stream.V4.TaskData.FunctionCall.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */             compositeEncoder.endStructure(serialDescriptor);
/*     */           }
/*     */           
/*     */           static {
/*     */             PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FunctionCallMetadata", INSTANCE, 3);
/*     */             pluginGeneratedSerialDescriptor.addElement("event_type", true);
/*     */             pluginGeneratedSerialDescriptor.addElement("name", true);
/*     */             pluginGeneratedSerialDescriptor.addElement("content", false);
/*     */             descriptor = pluginGeneratedSerialDescriptor;
/*     */           }
/*     */         }
/*     */         
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$FunctionCall$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$FunctionCall;", "api-gateway-api"})
/*     */         public static final class Companion {
/*     */           private Companion() {}
/*     */           
/*     */           @NotNull
/*     */           public final KSerializer<TaskAPI.Stream.V4.TaskData.FunctionCall> serializer() {
/*     */             return (KSerializer<TaskAPI.Stream.V4.TaskData.FunctionCall>)TaskAPI.Stream.V4.TaskData.FunctionCall.$serializer.INSTANCE;
/*     */           }
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public String getContent() {
/*     */           return this.content;
/*     */         }
/*     */         
/*     */         @Nullable
/*     */         public final String getName() {
/*     */           return this.name;
/*     */         }
/*     */         
/*     */         public FunctionCall(@Nullable String name, @NotNull String content) {
/*     */           super(null);
/*     */           this.name = name;
/*     */           this.content = content;
/*     */         }
/*     */       }
/*     */       
/*     */       @Serializable
/*     */       @SerialName("UnknownMetadata")
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\007\032\b\022\004\022\0020\0000\bHÆ\001R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$UnknownMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "serializer", "Lkotlinx/serialization/KSerializer;", "api-gateway-api"})
/*     */       public static final class UnknownMetadata extends TaskData {
/*     */         @NotNull
/*     */         public final KSerializer<UnknownMetadata> serializer() {
/*     */           return get$cachedSerializer();
/*     */         }
/*     */         
/*     */         private UnknownMetadata() {
/*     */           super(null);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         private static final String content = "";
/*     */         @NotNull
/*     */         public static final UnknownMetadata INSTANCE = new UnknownMetadata();
/*     */         
/*     */         @NotNull
/*     */         public String getContent() {
/*     */           return content;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @SerialName("UnknownMetadata")
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\007\032\b\022\004\022\0020\0000\bHÆ\001R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData$UnknownMetadata;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "serializer", "Lkotlinx/serialization/KSerializer;", "api-gateway-api"})
/*     */     public static final class UnknownMetadata extends TaskData {
/*     */       @NotNull
/*     */       public final KSerializer<UnknownMetadata> serializer() {
/*     */         return get$cachedSerializer();
/*     */       }
/*     */       
/*     */       private UnknownMetadata() {
/*     */         super(null);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       private static final String content = "";
/*     */       @NotNull
/*     */       public static final UnknownMetadata INSTANCE = new UnknownMetadata();
/*     */       
/*     */       @NotNull
/*     */       public String getContent() {
/*     */         return content;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskDataSerializer;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEventSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData;", "()V", "api-gateway-api"})
/*     */     public static final class TaskDataSerializer extends ContinuousSSEEventSerializer<TaskData> {
/*     */       @NotNull
/*     */       public static final TaskDataSerializer INSTANCE = new TaskDataSerializer();
/*     */       
/*     */       private TaskDataSerializer() {
/*     */         super(Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V4.TaskData.class), TaskAPI.Stream.V4.TaskData.Companion.serializer(), TaskAPI.Stream.V4.TaskData.UnknownMetadata.INSTANCE.serializer());
/*     */       }
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\task\TaskAPI$Stream.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */