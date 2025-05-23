/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*     */ 
/*     */ import com.fasterxml.jackson.core.JsonParser;
/*     */ import com.fasterxml.jackson.core.TreeNode;
/*     */ import com.fasterxml.jackson.databind.DeserializationContext;
/*     */ import com.fasterxml.jackson.databind.JsonDeserializer;
/*     */ import com.fasterxml.jackson.databind.JsonMappingException;
/*     */ import com.fasterxml.jackson.databind.JsonNode;
/*     */ import com.fasterxml.jackson.databind.node.ObjectNode;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\034\020\005\032\0020\0022\b\020\006\032\004\030\0010\0072\b\020\b\032\004\030\0010\tH\026¨\006\n"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageDeserializer;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage;", "<init>", "()V", "deserialize", "p", "Lcom/fasterxml/jackson/core/JsonParser;", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "tasks-provider-llm-prompt-velocity-model"})
/*     */ @SourceDebugExtension({"SMAP\nVelocityModelChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityModelChat.kt\nai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageDeserializer\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,155:1\n32#2,2:156\n*S KotlinDebug\n*F\n+ 1 VelocityModelChat.kt\nai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageDeserializer\n*L\n64#1:156,2\n*E\n"})
/*     */ public final class VelocityModelMessageDeserializer
/*     */   extends JsonDeserializer<VelocityModelMessage>
/*     */ {
/*     */   @NotNull
/*     */   public static final VelocityModelMessageDeserializer INSTANCE = new VelocityModelMessageDeserializer();
/*     */   
/*     */   @NotNull
/*     */   public VelocityModelMessage deserialize(@Nullable JsonParser p, @Nullable DeserializationContext ctxt) {
/*  48 */     if (p == null) throw new JsonMappingException((Closeable)p, "Parser is null"); 
/*  49 */     JsonNode jsonNode = (JsonNode)p.getCodec().readTree(p);
/*  50 */     if (jsonNode instanceof ObjectNode) {
/*  51 */       Iterator<Map.Entry> fields = ((ObjectNode)jsonNode).fields();
/*  52 */       Map.Entry field = fields.next();
/*  53 */       if (fields.hasNext()) {
/*  54 */         throw new JsonMappingException((Closeable)p, "More than one field is found for a message: " + jsonNode);
/*     */       }
/*     */       
/*  57 */       String str = (String)field.getKey(); if (str != null) { Object object1; Object content; Object object2; Object functionName; Iterator $this$forEach$iv; int $i$f$forEach; Iterator iterator1; switch (str.hashCode()) { case 1518048313: if (!str.equals("functionResponse")) {
/*     */               break;
/*     */             }
/*     */             
/*  61 */             object2 = field.getValue(); if (((object2 instanceof ObjectNode) ? object2 : null) == null) { (object2 instanceof ObjectNode) ? object2 : null; throw new JsonMappingException((Closeable)p, "Unexpected value of functionResponse: " + field.getValue()); }
/*  62 */              content = null;
/*  63 */             functionName = null;
/*  64 */             Intrinsics.checkNotNullExpressionValue(object1.fields(), "fields(...)"); $this$forEach$iv = object1.fields(); $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 156 */             iterator1 = $this$forEach$iv; if (iterator1.hasNext()) { Object element$iv = iterator1.next(); Map.Entry entry = (Map.Entry)element$iv; int $i$a$-forEach-VelocityModelMessageDeserializer$deserialize$1 = 0;
/*     */               Intrinsics.checkNotNull(entry);
/*     */               String key = (String)entry.getKey();
/*     */               JsonNode value = (JsonNode)entry.getValue();
/*     */               String str1 = key; }
/*     */             
/*     */             if (functionName == null)
/*     */               throw new JsonMappingException((Closeable)p, "functionName must not be empty: " + jsonNode); 
/*     */             if ((String)content == null) {
/*     */               (String)content;
/*     */               throw new JsonMappingException((Closeable)p, "content must not be empty: " + jsonNode);
/*     */             } 
/*     */             super((String)content, (String)content);
/*     */           case -887328209:
/*     */             if (!str.equals("system"))
/*     */               break; 
/*     */             Intrinsics.checkNotNullExpressionValue(p.getCodec().treeToValue((TreeNode)field.getValue(), VelocityModelMessageContent.class), "treeToValue(...)");
/*     */           case 1429828318:
/*     */             if (!str.equals("assistant"))
/*     */               break; 
/*     */             Intrinsics.checkNotNullExpressionValue(p.getCodec().treeToValue((TreeNode)field.getValue(), VelocityModelMessageContent.class), "treeToValue(...)");
/*     */           case 3599307:
/*     */             if (str.equals("user"))
/*     */               Intrinsics.checkNotNullExpressionValue(p.getCodec().treeToValue((TreeNode)field.getValue(), VelocityModelMessageContent.class), "treeToValue(...)"); 
/*     */             break; }
/*     */          }
/*     */       
/*     */       throw new JsonMappingException((Closeable)p, "Unexpected field: " + field + ".key");
/*     */     } 
/*     */     throw new JsonMappingException((Closeable)p, "Unexpected Json element: " + jsonNode);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelMessageDeserializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */