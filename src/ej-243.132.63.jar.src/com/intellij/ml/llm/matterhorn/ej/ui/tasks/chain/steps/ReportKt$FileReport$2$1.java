/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*     */ 
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.FileChangeView;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "Report.kt", l = {111}, i = {0, 0}, s = {"L$0", "L$2"}, n = {"destination$iv$iv", "element$iv$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportKt$FileReport$2$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n774#2:186\n865#2,2:187\n*S KotlinDebug\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$2$1\n*L\n111#1:186\n111#1:187,2\n*E\n"})
/*     */ final class ReportKt$FileReport$2$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   Object L$0;
/*     */   Object L$1;
/*     */   Object L$2;
/*     */   Object L$3;
/*     */   int label;
/*     */   
/*     */   ReportKt$FileReport$2$1(List<FileChangeView> $newFiles, MutableState<Set<FileChangeView>> $commitedFiles$delegate, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     List<FileChangeView> list1;
/*     */     int $i$f$filter;
/*     */     List<FileChangeView> list2;
/*     */     Collection<Object> collection1, destination$iv$iv;
/*     */     int $i$f$filterTo;
/*     */     Iterator<FileChangeView> iterator;
/*     */     Object element$iv$iv;
/*     */     int $i$a$-filter-ReportKt$FileReport$2$1$1;
/*     */     MutableState<Set<FileChangeView>> mutableState;
/* 110 */     Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 111 */         list1 = this.$newFiles; mutableState = this.$commitedFiles$delegate; $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 186 */         list2 = list1; collection1 = new ArrayList(); $i$f$filterTo = 0;
/* 187 */         iterator = list2.iterator(); if (iterator.hasNext()) { Object object = iterator.next(); FileChangeView it = (FileChangeView)object; int i = 0; if (it.getFileManipulationActions() != null) { this.L$0 = collection1; this.L$1 = iterator; this.L$2 = object; this.L$3 = mutableState; this.label = 1; if (it.getFileManipulationActions().isOnVCS((Continuation)this) == object1) return object1;  } else { it.getFileManipulationActions().isOnVCS((Continuation)this); if (false) collection1.add(object);  }  }
/* 188 */          ReportKt.access$FileReport$lambda$4(mutableState, CollectionsKt.toSet(collection1));
/*     */         return Unit.INSTANCE;
/*     */       case 1:
/*     */         $i$f$filter = 0;
/*     */         $i$f$filterTo = 0;
/*     */         $i$a$-filter-ReportKt$FileReport$2$1$1 = 0;
/*     */         mutableState = (MutableState<Set<FileChangeView>>)this.L$3;
/*     */         element$iv$iv = this.L$2;
/*     */         iterator = (Iterator<FileChangeView>)this.L$1;
/*     */         destination$iv$iv = (Collection)this.L$0;
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         if ((((Boolean)SYNTHETIC_LOCAL_VARIABLE_1).booleanValue() == true))
/*     */           destination$iv$iv.add(element$iv$iv);  }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super ReportKt$FileReport$2$1> $completion) {
/*     */     return (Continuation<Unit>)new ReportKt$FileReport$2$1(this.$newFiles, this.$commitedFiles$delegate, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((ReportKt$FileReport$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\ReportKt$FileReport$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */