/*    */ package com.intellij.ml.llm.matterhorn.ej.goland;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactRequest;
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ProjectCheckInput;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J<\020\004\032\n\022\002\b\003\022\002\b\0030\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\f\020\t\032\b\022\004\022\0020\0070\n2\006\020\013\032\0020\fH@¢\006\002\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/goland/GoLandProjectCheckMatterhornStarter;", "Lcom/intellij/ml/llm/matterhorn/ej/goland/GoLandAgentMatterhornStarter;", "<init>", "()V", "buildArtifactRequest", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "name", "", "task", "args", "", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-goland"})
/*    */ @SourceDebugExtension({"SMAP\nGoLandProjectCheckMatterhornStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoLandProjectCheckMatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ej/goland/GoLandProjectCheckMatterhornStarter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorServiceKt\n*L\n1#1,31:1\n774#2:32\n865#2,2:33\n1557#2:35\n1628#2,3:36\n117#3:39\n*S KotlinDebug\n*F\n+ 1 GoLandProjectCheckMatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ej/goland/GoLandProjectCheckMatterhornStarter\n*L\n21#1:32\n21#1:33,2\n23#1:35\n23#1:36,3\n26#1:39\n*E\n"})
/*    */ public final class GoLandProjectCheckMatterhornStarter extends GoLandAgentMatterhornStarter {
/*    */   @Nullable
/*    */   public Object buildArtifactRequest(@NotNull String name, @NotNull String task, @NotNull List args, @NotNull RootExecutionContext context, @NotNull Continuation $completion) {
/* 20 */     GoLandProjectCheckMatterhornStarterKt.access$getLogger$p().info("GoLandProjectCheckMatterhornStarter: " + args);
/* 21 */     Iterable $this$filter$iv = StringsKt.lines(task); int $i$f$filter = 0;
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
/* 32 */     Iterable iterable1 = $this$filter$iv; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 33 */     for (Object element$iv$iv : iterable1) { String it = (String)element$iv$iv; int $i$a$-filter-GoLandProjectCheckMatterhornStarter$buildArtifactRequest$tests$1 = 0; if (StringsKt.startsWith$default(it, "test:", false, 2, null)) collection.add(element$iv$iv);  }
/* 34 */      $this$filter$iv = collection; int $i$f$map = 0;
/* 35 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 36 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 37 */       String str = (String)item$iv$iv; Collection<String> collection1 = destination$iv$iv; int $i$a$-map-GoLandProjectCheckMatterhornStarter$buildArtifactRequest$tests$2 = 0; collection1.add(StringsKt.trim(StringsKt.removePrefix(str, "test:")).toString());
/* 38 */     }  List tests = (List)destination$iv$iv; ArtifactId artifactId = new ArtifactId(name, GoLandAgentArtifactTypes.INSTANCE.getProjectCheckArtifactType()); Object input$iv = new ProjectCheckInput(tests, tests); int $i$f$artifactRequest = 0;
/* 39 */     return new ArtifactRequest(artifactId, input$iv, ProjectCheckInput.Companion.serializer());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\goland\GoLandProjectCheckMatterhornStarter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */