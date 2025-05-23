/*    */ package org.jetbrains.jewel.foundation.lazy;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function4;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\030\002\n\002\b\021\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\001\022\006\020\002\032\0020\003\022!\020\004\032\035\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\t0\005\022#\020\n\032\037\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\006\022\004\030\0010\t0\005\0221\020\013\032-\022\004\022\0020\r\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\0160\f¢\006\002\b\017¢\006\002\b\020¢\006\004\b\021\020\022J\t\020\033\032\0020\003HÆ\003J$\020\034\032\035\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\t0\005HÆ\003J&\020\035\032\037\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\006\022\004\030\0010\t0\005HÆ\003J9\020\036\032-\022\004\022\0020\r\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\0160\f¢\006\002\b\017¢\006\002\b\020HÆ\003¢\006\002\020\031J\001\020\037\032\0020\0002\b\b\002\020\002\032\0020\0032#\b\002\020\004\032\035\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\t0\0052%\b\002\020\n\032\037\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\006\022\004\030\0010\t0\00523\b\002\020\013\032-\022\004\022\0020\r\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\0160\f¢\006\002\b\017¢\006\002\b\020HÆ\001¢\006\002\020 J\023\020!\032\0020\"2\b\020#\032\004\030\0010\tHÖ\003J\t\020$\032\0020\003HÖ\001J\t\020%\032\0020&HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\023\020\024R,\020\004\032\035\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\t0\005¢\006\b\n\000\032\004\b\025\020\026R.\020\n\032\037\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\006\022\004\030\0010\t0\005¢\006\b\n\000\032\004\b\027\020\026R>\020\013\032-\022\004\022\0020\r\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\0160\f¢\006\002\b\017¢\006\002\b\020¢\006\n\n\002\020\032\032\004\b\030\020\031¨\006'"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;", "count", "", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "contentType", "itemContent", "Lkotlin/Function2;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "getCount", "()I", "getKey", "()Lkotlin/jvm/functions/Function1;", "getContentType", "getItemContent", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/jvm/functions/Function4;", "component1", "component2", "component3", "component4", "copy", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items;", "equals", "", "other", "hashCode", "toString", "", "foundation"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class Items
/*    */   implements SelectableLazyListScopeContainer.Entry
/*    */ {
/*    */   private final int count;
/*    */   @NotNull
/*    */   private final Function1<Integer, Object> key;
/*    */   @NotNull
/*    */   private final Function1<Integer, Object> contentType;
/*    */   @NotNull
/*    */   private final Function4<SelectableLazyItemScope, Integer, Composer, Integer, Unit> itemContent;
/*    */   public static final int $stable;
/*    */   
/*    */   public Items(int count, @NotNull Function1<Integer, Object> key, @NotNull Function1<Integer, Object> contentType, @NotNull Function4<SelectableLazyItemScope, Integer, Composer, Integer, Unit> itemContent) {
/* 87 */     this.count = count;
/* 88 */     this.key = key;
/* 89 */     this.contentType = contentType;
/* 90 */     this.itemContent = itemContent; } @NotNull public final Function4<SelectableLazyItemScope, Integer, Composer, Integer, Unit> getItemContent() { return this.itemContent; }
/*    */ 
/*    */   
/*    */   public final int getCount() {
/*    */     return this.count;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function1<Integer, Object> getKey() {
/*    */     return this.key;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function1<Integer, Object> getContentType() {
/*    */     return this.contentType;
/*    */   }
/*    */   
/*    */   public final int component1() {
/*    */     return this.count;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function1<Integer, Object> component2() {
/*    */     return this.key;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function1<Integer, Object> component3() {
/*    */     return this.contentType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function4<SelectableLazyItemScope, Integer, Composer, Integer, Unit> component4() {
/*    */     return this.itemContent;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Items copy(int count, @NotNull Function1<? super Integer, ? extends Object> key, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super SelectableLazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullParameter(contentType, "contentType");
/*    */     Intrinsics.checkNotNullParameter(itemContent, "itemContent");
/*    */     return new Items(count, key, contentType, itemContent);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Items(count=" + this.count + ", key=" + this.key + ", contentType=" + this.contentType + ", itemContent=" + this.itemContent + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.count);
/*    */     result = result * 31 + this.key.hashCode();
/*    */     result = result * 31 + this.contentType.hashCode();
/*    */     return result * 31 + this.itemContent.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Items))
/*    */       return false; 
/*    */     Items items = (Items)other;
/*    */     return (this.count != items.count) ? false : (!Intrinsics.areEqual(this.key, items.key) ? false : (!Intrinsics.areEqual(this.contentType, items.contentType) ? false : (!!Intrinsics.areEqual(this.itemContent, items.itemContent))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyListScopeContainer$Entry$Items.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */