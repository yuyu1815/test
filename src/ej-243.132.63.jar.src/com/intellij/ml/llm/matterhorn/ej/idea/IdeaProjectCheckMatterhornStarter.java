/*    */ package com.intellij.ml.llm.matterhorn.ej.idea;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ProjectCheckInput;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J<\020\004\032\n\022\002\b\003\022\002\b\0030\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\f\020\t\032\b\022\004\022\0020\0070\n2\006\020\013\032\0020\fH@¢\006\002\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckMatterhornStarter;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaAgentMatterhornStarter;", "<init>", "()V", "buildArtifactRequest", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "name", "", "task", "args", "", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-idea"})
/*    */ @SourceDebugExtension({"SMAP\nIdeaProjectCheckMatterhornStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdeaProjectCheckMatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckMatterhornStarter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorServiceKt\n*L\n1#1,25:1\n774#2:26\n865#2,2:27\n1557#2:29\n1628#2,3:30\n774#2:33\n865#2,2:34\n1557#2:36\n1628#2,3:37\n117#3:40\n*S KotlinDebug\n*F\n+ 1 IdeaProjectCheckMatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckMatterhornStarter\n*L\n19#1:26\n19#1:27,2\n19#1:29\n19#1:30,3\n20#1:33\n20#1:34,2\n20#1:36\n20#1:37,3\n22#1:40\n*E\n"})
/*    */ public final class IdeaProjectCheckMatterhornStarter extends IdeaAgentMatterhornStarter {
/*    */   @Nullable
/*    */   public Object buildArtifactRequest(@NotNull String name, @NotNull String task, @NotNull List args, @NotNull RootExecutionContext context, @NotNull Continuation $completion) {
/* 17 */     IdeaAgentMatterhornStarter.Companion.getLogger().info("IdeaProjectCheckMatterhornStarter: " + args);
/* 18 */     projectInformation(IdeaAgentMatterhornStarter.Companion.getLogger(), context);
/* 19 */     Iterable $this$filter$iv = StringsKt.lines(task); int $i$f$filter = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 26 */     Iterable iterable2 = $this$filter$iv; Collection<Object> collection1 = new ArrayList(); int $i$f$filterTo = 0;
/* 27 */     for (Object element$iv$iv : iterable2) { String it = (String)element$iv$iv; int $i$a$-filter-IdeaProjectCheckMatterhornStarter$buildArtifactRequest$tests$1 = 0; if (StringsKt.startsWith$default(it, "test:", false, 2, null)) collection1.add(element$iv$iv);  }
/* 28 */      $this$filter$iv = collection1; int $i$f$map = 0;
/* 29 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 30 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 31 */       String str = (String)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-IdeaProjectCheckMatterhornStarter$buildArtifactRequest$tests$2 = 0; collection.add(StringsKt.trim(StringsKt.removePrefix(str, "test:")).toString());
/* 32 */     }  List tests = (List)destination$iv$iv; Iterable iterable1 = StringsKt.lines(task); int j = 0;
/* 33 */     Iterable iterable4 = iterable1; Collection<Object> collection3 = new ArrayList(); int m = 0;
/* 34 */     for (Object element$iv$iv : iterable4) { String it = (String)element$iv$iv; int $i$a$-filter-IdeaProjectCheckMatterhornStarter$buildArtifactRequest$files$1 = 0; if (StringsKt.startsWith$default(it, "file:", false, 2, null)) collection3.add(element$iv$iv);  }
/* 35 */      iterable1 = collection3; int i = 0;
/* 36 */     Iterable iterable3 = iterable1; Collection<String> collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); int k = 0;
/* 37 */     for (Object item$iv$iv : iterable3) {
/* 38 */       String str = (String)item$iv$iv; Collection<String> collection = collection2; int $i$a$-map-IdeaProjectCheckMatterhornStarter$buildArtifactRequest$files$2 = 0; collection.add(StringsKt.trim(StringsKt.removePrefix(str, "file:")).toString());
/* 39 */     }  List files = (List)collection2; ProjectCheckInput input = new ProjectCheckInput(files, tests); ArtifactId artifact$iv = new ArtifactId(name, IdeaAgentArtifactTypes.INSTANCE.getProjectCheckArtifactType()); int $i$f$artifactRequest = 0;
/* 40 */     return new ArtifactRequest(artifact$iv, input, ProjectCheckInput.Companion.serializer());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\IdeaProjectCheckMatterhornStarter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */