/*    */ package com.intellij.ml.llm.matterhorn.utils;
/*    */ import com.intellij.ml.llm.matterhorn.TrajectoryElement;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import kotlinx.serialization.json.Json;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\026\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005¨\006\006"}, d2 = {"trajectoryElementToString", "", "json", "Lkotlinx/serialization/json/Json;", "element", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;", "core"})
/*    */ @SourceDebugExtension({"SMAP\nLogginUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogginUtils.kt\ncom/intellij/ml/llm/matterhorn/utils/LogginUtilsKt\n+ 2 Json.kt\nkotlinx/serialization/json/JsonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,17:1\n324#2:18\n774#3:19\n865#3,2:20\n*S KotlinDebug\n*F\n+ 1 LogginUtils.kt\ncom/intellij/ml/llm/matterhorn/utils/LogginUtilsKt\n*L\n14#1:18\n15#1:19\n15#1:20,2\n*E\n"})
/*    */ public final class LogginUtilsKt {
/*    */   @NotNull
/*    */   public static final String trajectoryElementToString(@NotNull Json json, @NotNull TrajectoryElement element) {
/* 12 */     Intrinsics.checkNotNullParameter(json, "json"); Intrinsics.checkNotNullParameter(element, "element"); String timestamp = "\"timestamp\":" + System.currentTimeMillis() / 1000L;
/*    */     
/* 14 */     Json $this$encodeToJsonElement$iv = RootExecutionContext.Companion.getJson(); int $i$f$encodeToJsonElement = 0;
/*    */ 
/*    */ 
/*    */     
/* 18 */     $this$encodeToJsonElement$iv.getSerializersModule(); Set set1 = JsonElementKt.getJsonObject($this$encodeToJsonElement$iv.encodeToJsonElement((SerializationStrategy)TrajectoryElement.Companion.serializer(), element)).entrySet(); int $i$f$filter = 0;
/* 19 */     Set set2 = set1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 20 */     for (Object element$iv$iv : set2) { Map.Entry it = (Map.Entry)element$iv$iv; int $i$a$-filter-LogginUtilsKt$trajectoryElementToString$1 = 0; if (!Intrinsics.areEqual(it.getKey(), "type")) destination$iv$iv.add(element$iv$iv);  }
/* 21 */      return CollectionsKt.joinToString$default(destination$iv$iv, ",", "{" + timestamp + ",", "}", 0, null, LogginUtilsKt::trajectoryElementToString$lambda$1, 24, null);
/*    */   }
/*    */   
/*    */   private static final CharSequence trajectoryElementToString$lambda$1(Map.Entry paramEntry) {
/*    */     Intrinsics.checkNotNullParameter(paramEntry, "<destruct>");
/*    */     String k = (String)paramEntry.getKey();
/*    */     JsonElement v = (JsonElement)paramEntry.getValue();
/*    */     return "\"" + k + "\":" + v;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhor\\utils\LogginUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */