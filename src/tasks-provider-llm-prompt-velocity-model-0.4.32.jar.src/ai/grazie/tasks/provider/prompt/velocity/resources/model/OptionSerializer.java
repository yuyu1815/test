/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*     */ 
/*     */ import com.fasterxml.jackson.core.JsonParser;
/*     */ import com.fasterxml.jackson.databind.DeserializationContext;
/*     */ import com.fasterxml.jackson.databind.JsonDeserializer;
/*     */ import com.fasterxml.jackson.databind.JsonMappingException;
/*     */ import com.fasterxml.jackson.databind.JsonNode;
/*     */ import com.fasterxml.jackson.databind.node.ObjectNode;
/*     */ import com.fasterxml.jackson.databind.node.TextNode;
/*     */ import java.io.Closeable;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\034\020\005\032\0020\0022\b\020\006\032\004\030\0010\0072\b\020\b\032\004\030\0010\tH\026¨\006\n"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/OptionSerializer;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent$Options$Option;", "<init>", "()V", "deserialize", "p", "Lcom/fasterxml/jackson/core/JsonParser;", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "tasks-provider-llm-prompt-velocity-model"})
/*     */ @SourceDebugExtension({"SMAP\nVelocityModelChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityModelChat.kt\nai/grazie/tasks/provider/prompt/velocity/resources/model/OptionSerializer\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n32#2,2:156\n1#3:158\n*S KotlinDebug\n*F\n+ 1 VelocityModelChat.kt\nai/grazie/tasks/provider/prompt/velocity/resources/model/OptionSerializer\n*L\n142#1:156,2\n*E\n"})
/*     */ public final class OptionSerializer
/*     */   extends JsonDeserializer<VelocityModelSingleMessageContent.Options.Option>
/*     */ {
/*     */   @NotNull
/*     */   public static final OptionSerializer INSTANCE = new OptionSerializer();
/*     */   
/*     */   @NotNull
/*     */   public VelocityModelSingleMessageContent.Options.Option deserialize(@Nullable JsonParser p, @Nullable DeserializationContext ctxt) {
/* 137 */     if (p == null) throw new JsonMappingException((Closeable)p, "Parser is null"); 
/* 138 */     JsonNode jsonNode = (JsonNode)p.getCodec().readTree(p);
/* 139 */     if (jsonNode instanceof TextNode) { Intrinsics.checkNotNullExpressionValue(((TextNode)jsonNode).asText(), "asText(...)"); }
/* 140 */     else { Iterator iterator; if (jsonNode instanceof ObjectNode)
/* 141 */       { Object value = null;
/* 142 */         Intrinsics.checkNotNullExpressionValue(((ObjectNode)jsonNode).fields(), "fields(...)"); Iterator $this$forEach$iv = ((ObjectNode)jsonNode).fields(); int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 156 */         iterator = $this$forEach$iv; } else { throw new JsonMappingException((Closeable)p, "Unexpected JSON element: " + jsonNode); }  if (iterator.hasNext()) { Object element$iv = iterator.next(); Map.Entry it = (Map.Entry)element$iv; int $i$a$-forEach-OptionSerializer$deserialize$1 = 0;
/*     */         if (Intrinsics.areEqual(it.getKey(), "value")) {
/*     */           String str = ((JsonNode)it.getValue()).asText();
/*     */         } else {
/*     */           throw new JsonMappingException((Closeable)p, "Unexpected field: " + it.getKey());
/*     */         }  }
/*     */        }
/*     */     
/*     */     return (VelocityModelSingleMessageContent.Options.Option)p;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\OptionSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */