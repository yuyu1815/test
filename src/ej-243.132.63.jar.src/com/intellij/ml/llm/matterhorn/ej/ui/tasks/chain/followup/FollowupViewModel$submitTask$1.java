/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.followup;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.IssueType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskService;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.ExplicitTaskContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.PreviousTasksInfo;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainEntity;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.AttachedFile;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptMode;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptOwnerViewModelKt;
/*    */ import java.nio.file.Path;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "FollowupViewModel.kt", l = {61}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.followup.FollowupViewModel$submitTask$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ @SourceDebugExtension({"SMAP\nFollowupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowupViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel$submitTask$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1557#2:74\n1628#2,3:75\n*S KotlinDebug\n*F\n+ 1 FollowupViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel$submitTask$1\n*L\n66#1:74\n66#1:75,3\n*E\n"})
/*    */ final class FollowupViewModel$submitTask$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   FollowupViewModel$submitTask$1(TaskChainEntity $chainEntity, PromptMode $mode, String $followupText, PreviousTasksInfo $previousTasksInfo, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     Iterable iterable1;
/*    */     int $i$f$map;
/*    */     Iterable iterable2;
/*    */     Collection<Path> destination$iv$iv;
/*    */     int $i$f$mapTo;
/*    */     TaskService taskService;
/*    */     TaskChainId taskChainId;
/*    */     IssueType issueType1;
/*    */     String str1;
/*    */     List list1, list2;
/*    */     String str2;
/*    */     IssueType issueType2;
/* 60 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 66 */         iterable1 = (Iterable)FollowupViewModel.this.getAttachedFiles().getAttachedFiles().getValue(); str1 = this.$followupText; issueType1 = PromptOwnerViewModelKt.toTaskType(this.$mode); taskChainId = this.$chainEntity.getId(); taskService = FollowupViewModel.access$getTaskService$p(FollowupViewModel.this); $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 74 */         iterable2 = iterable1; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); $i$f$mapTo = 0;
/* 75 */         for (Object item$iv$iv : iterable2) {
/* 76 */           AttachedFile attachedFile = (AttachedFile)item$iv$iv; Collection<Path> collection = destination$iv$iv; int $i$a$-map-FollowupViewModel$submitTask$1$1 = 0; collection.add(attachedFile.getPath());
/* 77 */         }  list1 = (List)destination$iv$iv;
/*    */         list2 = list1;
/*    */         str2 = str1;
/*    */         issueType2 = issueType1;
/*    */         this.label = 1;
/*    */         if (taskService.start(taskChainId, new ExplicitTaskContext(issueType2, str2, list2), this.$previousTasksInfo, (Continuation)this) == object)
/*    */           return object; 
/*    */         taskService.start(taskChainId, new ExplicitTaskContext(issueType2, str2, list2), this.$previousTasksInfo, (Continuation)this);
/*    */         return Unit.INSTANCE;
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super FollowupViewModel$submitTask$1> $completion) {
/*    */     return (Continuation<Unit>)new FollowupViewModel$submitTask$1(this.$chainEntity, this.$mode, this.$followupText, this.$previousTasksInfo, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((FollowupViewModel$submitTask$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\followup\FollowupViewModel$submitTask$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */