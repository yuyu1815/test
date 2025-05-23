/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.OpHandle;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\021\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J7\020\004\032\b\022\004\022\002H\0060\005\"\004\b\001\020\0062\036\020\007\032\020\022\f\b\001\022\b\022\004\022\002H\0060\0050\b\"\b\022\004\022\002H\0060\005¢\006\002\020\tJI\020\n\032\016\022\n\022\b\022\004\022\002H\0060\0050\013\"\004\b\001\020\0062*\020\f\032\026\022\022\b\001\022\016\022\n\022\b\022\004\022\002H\0060\0050\0130\b\"\016\022\n\022\b\022\004\022\002H\0060\0050\013¢\006\002\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$Companion;", "", "<init>", "()V", "of", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;", "Err", "handles", "", "([Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;", "callableOf", "Lkotlin/Function0;", "callables", "([Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", "state.junie.impl"})
/*    */ @SourceDebugExtension({"SMAP\nCompoundOpHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompoundOpHandle.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,34:1\n11165#2:35\n11500#2,3:36\n*S KotlinDebug\n*F\n+ 1 CompoundOpHandle.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$Companion\n*L\n31#1:35\n31#1:36,3\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final <Err> OpHandle<Err> of(@NotNull OpHandle... handles) {
/* 30 */     Intrinsics.checkNotNullParameter(handles, "handles"); return new CompoundOpHandle<>(ArraysKt.toList((Object[])handles)); } @NotNull
/* 31 */   public final <Err> Function0<OpHandle<Err>> callableOf(@NotNull Function0... callables) { Intrinsics.checkNotNullParameter(callables, "callables"); return callables::callableOf$lambda$1; } private static final CompoundOpHandle callableOf$lambda$1(Function0[] $callables) { Function0[] arrayOfFunction01 = $callables; int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */     
/* 35 */     Function0[] arrayOfFunction02 = arrayOfFunction01; Collection<OpHandle> destination$iv$iv = new ArrayList(arrayOfFunction01.length); int $i$f$mapTo = 0; byte b; int i;
/* 36 */     for (b = 0, i = arrayOfFunction02.length; b < i; ) { Object item$iv$iv = arrayOfFunction02[b];
/* 37 */       Object object1 = item$iv$iv; Collection<OpHandle> collection = destination$iv$iv; int $i$a$-map-CompoundOpHandle$Companion$callableOf$1$1 = 0; collection.add((OpHandle)object1.invoke()); }
/* 38 */      List<? extends OpHandle<?>> list = (List)destination$iv$iv;
/*    */     return new CompoundOpHandle(list); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\CompoundOpHandle$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */