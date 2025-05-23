/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005R\027\020\006\032\b\022\004\022\0020\0050\007¢\006\b\n\000\032\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ResolveIssueSupport$Companion;", "", "<init>", "()V", "getSupport", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ResolveIssueSupport;", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "getEP_NAME", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nResolveIssueSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolveIssueSupport.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/ResolveIssueSupport$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,17:1\n1557#2:18\n1628#2,3:19\n*S KotlinDebug\n*F\n+ 1 ResolveIssueSupport.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/ResolveIssueSupport$Companion\n*L\n9#1:18\n9#1:19,3\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final ResolveIssueSupport getSupport() {
/*  8 */     if ((ResolveIssueSupport)CollectionsKt.singleOrNull(EP_NAME.getExtensionList()) == null) { (ResolveIssueSupport)CollectionsKt.singleOrNull(EP_NAME.getExtensionList());
/*  9 */       Iterable $this$map$iv = EP_NAME.getExtensionList(); int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 18 */       Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 19 */       for (Object item$iv$iv : iterable1) {
/* 20 */         ResolveIssueSupport resolveIssueSupport = (ResolveIssueSupport)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-ResolveIssueSupport$Companion$getSupport$1 = 0; collection.add(resolveIssueSupport.getClass().getSimpleName());
/* 21 */       }  String str = "More than one ResolveIssueSupport is found: " + (List)destination$iv$iv;
/*    */       throw new IllegalStateException(str.toString()); }
/*    */     
/*    */     return (ResolveIssueSupport)CollectionsKt.singleOrNull(EP_NAME.getExtensionList());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final ExtensionPointName<ResolveIssueSupport> EP_NAME = new ExtensionPointName("com.intellij.ml.llm.matterhorn.resolveIssueSupport");
/*    */   
/*    */   @NotNull
/*    */   public final ExtensionPointName<ResolveIssueSupport> getEP_NAME() {
/*    */     return EP_NAME;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\ResolveIssueSupport$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */