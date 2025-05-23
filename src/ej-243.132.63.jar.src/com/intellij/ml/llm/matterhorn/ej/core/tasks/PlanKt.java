/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.text.StringsKt;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\032\026\020\000\032\n\022\004\022\0020\002\030\0010\0012\006\020\003\032\0020\004¨\006\005"}, d2 = {"parsePlanFromXML", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/PlanItem;", "xmlContent", "", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Plan.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/PlanKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1557#2:45\n1628#2,3:46\n774#2:49\n865#2,2:50\n1557#2:52\n1628#2,3:53\n*S KotlinDebug\n*F\n+ 1 Plan.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/PlanKt\n*L\n19#1:45\n19#1:46,3\n20#1:49\n20#1:50,2\n21#1:52\n21#1:53,3\n*E\n"})
/*    */ public final class PlanKt {
/*    */   @Nullable
/*    */   public static final List<PlanItem> parsePlanFromXML(@NotNull String xmlContent) {
/* 12 */     Intrinsics.checkNotNullParameter(xmlContent, "xmlContent"); try {
/* 13 */       String planContent = ExtractorUtilsKt.getTextByXMLTag(xmlContent, "PLAN");
/* 14 */       if ((((CharSequence)planContent).length() == 0)) {
/* 15 */         return null;
/*    */       }
/*    */       
/* 18 */       String[] arrayOfString = new String[1]; arrayOfString[0] = "\n"; List list1 = StringsKt.split$default(planContent, arrayOfString, false, 0, 6, null);
/* 19 */       int i = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 45 */       List list2 = list1; Collection<String> collection1 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int j = 0;
/* 46 */       for (Object item$iv$iv : list2) {
/* 47 */         String str = (String)item$iv$iv; Collection<String> collection2 = collection1; int $i$a$-map-PlanKt$parsePlanFromXML$items$1 = 0; collection2.add(StringsKt.trim(str).toString());
/* 48 */       }  Iterable $this$map$iv = collection1; int $i$f$filter = 0;
/* 49 */       Iterable $this$mapTo$iv$iv = $this$map$iv; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 50 */       for (Object element$iv$iv : $this$mapTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filter-PlanKt$parsePlanFromXML$items$2 = 0; if ((((CharSequence)it).length() > 0)) collection.add(element$iv$iv);  }
/* 51 */        Iterable $this$filter$iv = collection; int $i$f$map = 0;
/* 52 */       Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 53 */       for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 54 */         String it = (String)item$iv$iv; Collection collection2 = destination$iv$iv; int $i$a$-map-PlanKt$parsePlanFromXML$items$3 = 0; Status status = Status.Companion.fromSymbol(StringsKt.last(it));
/* 55 */       }  List<PlanItem> items = (List)destination$iv$iv;
/*    */       return items;
/*    */     } catch (Exception e) {
/*    */       return null;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\PlanKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */