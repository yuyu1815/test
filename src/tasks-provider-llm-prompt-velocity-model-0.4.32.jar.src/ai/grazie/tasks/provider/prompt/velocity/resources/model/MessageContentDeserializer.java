/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*     */ 
/*     */ import com.fasterxml.jackson.core.JsonParser;
/*     */ import com.fasterxml.jackson.core.TreeNode;
/*     */ import com.fasterxml.jackson.databind.DeserializationContext;
/*     */ import com.fasterxml.jackson.databind.JsonDeserializer;
/*     */ import com.fasterxml.jackson.databind.JsonMappingException;
/*     */ import com.fasterxml.jackson.databind.JsonNode;
/*     */ import com.fasterxml.jackson.databind.node.TextNode;
/*     */ import java.io.Closeable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\034\020\005\032\0020\0022\b\020\006\032\004\030\0010\0072\b\020\b\032\004\030\0010\tH\026¨\006\n"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/MessageContentDeserializer;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent;", "<init>", "()V", "deserialize", "p", "Lcom/fasterxml/jackson/core/JsonParser;", "context", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "tasks-provider-llm-prompt-velocity-model"})
/*     */ @SourceDebugExtension({"SMAP\nVelocityModelChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityModelChat.kt\nai/grazie/tasks/provider/prompt/velocity/resources/model/MessageContentDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1557#2:156\n1628#2,3:157\n*S KotlinDebug\n*F\n+ 1 VelocityModelChat.kt\nai/grazie/tasks/provider/prompt/velocity/resources/model/MessageContentDeserializer\n*L\n126#1:156\n126#1:157,3\n*E\n"})
/*     */ public final class MessageContentDeserializer
/*     */   extends JsonDeserializer<VelocityModelSingleMessageContent>
/*     */ {
/*     */   @NotNull
/*     */   public static final MessageContentDeserializer INSTANCE = new MessageContentDeserializer();
/*     */   
/*     */   @NotNull
/*     */   public VelocityModelSingleMessageContent deserialize(@Nullable JsonParser p, @Nullable DeserializationContext context) {
/* 123 */     if (p == null) throw new JsonMappingException((Closeable)p, "Parser is null"); 
/* 124 */     JsonNode jsonNode = (JsonNode)p.getCodec().readTree(p);
/* 125 */     Intrinsics.checkNotNullExpressionValue(((TextNode)jsonNode).asText(), "asText(...)");
/* 126 */     if (jsonNode instanceof com.fasterxml.jackson.databind.node.ArrayNode) { Iterable $this$map$iv = (Iterable)jsonNode; int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 156 */       Iterable iterable1 = $this$map$iv; Collection<VelocityModelSingleMessageContent.Options.Option> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 157 */       for (Object item$iv$iv : iterable1) {
/* 158 */         JsonNode jsonNode1 = (JsonNode)item$iv$iv; Collection<VelocityModelSingleMessageContent.Options.Option> collection = destination$iv$iv; int $i$a$-map-MessageContentDeserializer$deserialize$1 = 0; collection.add((VelocityModelSingleMessageContent.Options.Option)p.getCodec().treeToValue((TreeNode)jsonNode1, VelocityModelSingleMessageContent.Options.Option.class));
/* 159 */       }  List list = (List)destination$iv$iv; }
/*     */     else
/*     */     { throw new JsonMappingException((Closeable)p, "Unexpected JSON element: " + jsonNode); }
/*     */     
/*     */     return (jsonNode instanceof TextNode) ? new VelocityModelSingleMessageContent.Plain(((TextNode)jsonNode).asText()) : (VelocityModelSingleMessageContent)p;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\MessageContentDeserializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */