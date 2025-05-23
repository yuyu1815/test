/*    */ package ai.grazie.client.cbor.extensions;
/*    */ import ai.grazie.client.common.HTTPClient;
/*    */ import ai.grazie.client.common.model.HTTPResponse;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.utils.cbor.CBOR;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\0002\n\002\b\003\n\002\020\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\032X\020\000\032\002H\001\"\n\b\000\020\002\030\001*\0020\003\"\n\b\001\020\001\030\001*\0020\003*\0020\0042\006\020\005\032\0020\0062\006\020\007\032\002H\0022\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\rH\b¢\006\002\020\016\032m\020\000\032\002H\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\001*\0020\003*\0020\0042\006\020\005\032\0020\0062\006\020\007\032\002H\0022\f\020\017\032\b\022\004\022\002H\0020\0202\f\020\021\032\b\022\004\022\002H\0010\0202\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r¢\006\002\020\022¨\006\023"}, d2 = {"sendAndGet", "O", "I", "", "Lai/grazie/client/common/HTTPClient;", "url", "", "content", "options", "Lai/grazie/client/common/model/RequestOptions;", "json", "Lai/grazie/utils/json/JSON;", "cbor", "Lai/grazie/utils/cbor/CBOR;", "(Lai/grazie/client/common/HTTPClient;Ljava/lang/String;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lai/grazie/utils/cbor/CBOR;)Ljava/lang/Object;", "input", "Lkotlinx/serialization/KSerializer;", "output", "(Lai/grazie/client/common/HTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lai/grazie/utils/cbor/CBOR;)Ljava/lang/Object;", "client-cbor"})
/*    */ public final class ClientExtensionsKt {
/*    */   @NotNull
/*    */   public static final <I, O> O sendAndGet(@NotNull HTTPClient $this$sendAndGet, @NotNull String url, @NotNull Object content, @NotNull KSerializer input, @NotNull KSerializer output, @NotNull RequestOptions options, @NotNull JSON json, @NotNull CBOR cbor) {
/* 20 */     Intrinsics.checkNotNullParameter($this$sendAndGet, "<this>"); Intrinsics.checkNotNullParameter(url, "url"); Intrinsics.checkNotNullParameter(content, "content"); Intrinsics.checkNotNullParameter(input, "input"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(options, "options"); Intrinsics.checkNotNullParameter(json, "json"); Intrinsics.checkNotNullParameter(cbor, "cbor"); String serialized = json.string((SerializationStrategy)input, content);
/* 21 */     HTTPResponse response = $this$sendAndGet.send(url, serialized, options);
/* 22 */     Intrinsics.checkNotNull(response.getBytes()); return (O)cbor.parse((DeserializationStrategy)output, response.getBytes());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-cbor-jvm-0.4.32.jar!\ai\grazie\client\cbor\extensions\ClientExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */