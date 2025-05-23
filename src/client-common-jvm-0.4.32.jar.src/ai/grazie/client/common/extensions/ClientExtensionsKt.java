/*    */ package ai.grazie.client.common.extensions;
/*    */ 
/*    */ import ai.grazie.client.common.HTTPClient;
/*    */ import ai.grazie.client.common.model.HTTPResponse;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.MagicApiIntrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.SerializersKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\0004\n\002\b\003\n\002\020\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\032N\020\000\032\002H\001\"\n\b\000\020\002\030\001*\0020\003\"\n\b\001\020\001\030\001*\0020\003*\0020\0042\006\020\005\032\0020\0062\006\020\007\032\002H\0022\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013H\b¢\006\002\020\f\032c\020\000\032\002H\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\001*\0020\003*\0020\0042\006\020\005\032\0020\0062\006\020\007\032\002H\0022\f\020\r\032\b\022\004\022\002H\0020\0162\f\020\017\032\b\022\004\022\002H\0010\0162\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013¢\006\002\020\020\032B\020\021\032\0020\022\"\n\b\000\020\002\030\001*\0020\003*\0020\0042\006\020\005\032\0020\0062\006\020\007\032\002H\0022\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013H\b¢\006\002\020\023\032K\020\021\032\0020\022\"\b\b\000\020\002*\0020\003*\0020\0042\006\020\005\032\0020\0062\006\020\007\032\002H\0022\f\020\r\032\b\022\004\022\002H\0020\0162\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013¢\006\002\020\024¨\006\025"}, d2 = {"sendAndGet", "O", "I", "", "Lai/grazie/client/common/HTTPClient;", "url", "", "content", "options", "Lai/grazie/client/common/model/RequestOptions;", "json", "Lai/grazie/utils/json/JSON;", "(Lai/grazie/client/common/HTTPClient;Ljava/lang/String;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;)Ljava/lang/Object;", "input", "Lkotlinx/serialization/KSerializer;", "output", "(Lai/grazie/client/common/HTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;)Ljava/lang/Object;", "sendAndWait", "", "(Lai/grazie/client/common/HTTPClient;Ljava/lang/String;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;)V", "(Lai/grazie/client/common/HTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;)V", "client-common"})
/*    */ public final class ClientExtensionsKt
/*    */ {
/*    */   public static final <I> void sendAndWait(@NotNull HTTPClient $this$sendAndWait, @NotNull String url, @NotNull Object content, @NotNull KSerializer input, @NotNull RequestOptions options, @NotNull JSON json) {
/* 25 */     Intrinsics.checkNotNullParameter($this$sendAndWait, "<this>"); Intrinsics.checkNotNullParameter(url, "url"); Intrinsics.checkNotNullParameter(content, "content"); Intrinsics.checkNotNullParameter(input, "input"); Intrinsics.checkNotNullParameter(options, "options"); Intrinsics.checkNotNullParameter(json, "json"); $this$sendAndWait.send(url, json.string((SerializationStrategy)input, content), options);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final <I, O> O sendAndGet(@NotNull HTTPClient $this$sendAndGet, @NotNull String url, @NotNull Object content, @NotNull KSerializer input, @NotNull KSerializer output, @NotNull RequestOptions options, @NotNull JSON json) {
/* 36 */     Intrinsics.checkNotNullParameter($this$sendAndGet, "<this>"); Intrinsics.checkNotNullParameter(url, "url"); Intrinsics.checkNotNullParameter(content, "content"); Intrinsics.checkNotNullParameter(input, "input"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(options, "options"); Intrinsics.checkNotNullParameter(json, "json"); String serialized = json.string((SerializationStrategy)input, content);
/* 37 */     HTTPResponse response = $this$sendAndGet.send(url, serialized, options);
/* 38 */     Intrinsics.checkNotNull(response.getContent()); return (O)json.parse((DeserializationStrategy)output, response.getContent());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\extensions\ClientExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */