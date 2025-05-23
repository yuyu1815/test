/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
/*    */ import kotlinx.serialization.json.JsonElement;
/*    */ import kotlinx.serialization.json.JsonElementKt;
/*    */ import kotlinx.serialization.json.JsonObject;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\b\022\004\022\0020\0020\001B\007¢\006\004\b\003\020\004J\026\020\005\032\b\022\004\022\0020\0020\0062\006\020\007\032\0020\bH\024¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectStructureItemSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;", "<init>", "()V", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "core"})
/*    */ public final class ProjectStructureItemSerializer
/*    */   extends JsonContentPolymorphicSerializer<ProjectStructureItem> {
/*    */   public ProjectStructureItemSerializer() {
/* 18 */     super(Reflection.getOrCreateKotlinClass(ProjectStructureItem.class)); } @NotNull
/*    */   protected DeserializationStrategy<ProjectStructureItem> selectDeserializer(@NotNull JsonElement element) {
/* 20 */     Intrinsics.checkNotNullParameter(element, "element"); JsonObject jsonObject = JsonElementKt.getJsonObject(element);
/*    */     
/* 22 */     return 
/* 23 */       ((Map)jsonObject).containsKey("content") ? (DeserializationStrategy)ProjectStructureFile.Companion.serializer() : (
/* 24 */       ((Map)jsonObject).containsKey("mediaContentId") ? (DeserializationStrategy)ProjectStructureBinaryFile.Companion.serializer() : 
/* 25 */       (DeserializationStrategy)ProjectStructureFolder.Companion.serializer());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectStructureItemSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */