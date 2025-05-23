/*    */ package org.jetbrains.compose.resources.plural;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import kotlin.Pair;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.compose.resources.LanguageQualifier;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\002\b\002\b\000\030\000 \0132\0020\001:\001\013B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\016\020\007\032\0020\b2\006\020\t\032\0020\nR\026\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\004\n\002\020\006¨\006\f"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRuleList;", "", "rules", "", "Lorg/jetbrains/compose/resources/plural/PluralRule;", "([Lorg/jetbrains/compose/resources/plural/PluralRule;)V", "[Lorg/jetbrains/compose/resources/plural/PluralRule;", "getCategory", "Lorg/jetbrains/compose/resources/plural/PluralCategory;", "quantity", "", "Companion", "library"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nPluralRuleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluralRuleList.kt\norg/jetbrains/compose/resources/plural/PluralRuleList\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,57:1\n1109#2,2:58\n26#3:60\n*S KotlinDebug\n*F\n+ 1 PluralRuleList.kt\norg/jetbrains/compose/resources/plural/PluralRuleList\n*L\n15#1:58,2\n20#1:60\n*E\n"})
/*    */ public final class PluralRuleList {
/* 13 */   public PluralRuleList(@NotNull PluralRule[] rules) { this.rules = rules; }
/*    */   @NotNull
/* 15 */   public final PluralCategory getCategory(int quantity) { PluralRule[] arrayOfPluralRule = this.rules; int $i$f$first = 0;
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
/*    */     byte b;
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
/*    */     int i;
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
/* 58 */     for (b = 0, i = arrayOfPluralRule.length; b < i; ) { Object element$iv = arrayOfPluralRule[b], object1 = element$iv; int $i$a$-first-PluralRuleList$getCategory$1 = 0; if (object1.appliesTo(quantity)) {  } else { b++; }  }
/* 59 */      throw new NoSuchElementException("Array contains no element matching the predicate."); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\b\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\b\032\004\030\0010\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\002J\020\020\016\032\0020\0062\006\020\017\032\0020\005H\002J\026\020\020\032\0020\0062\006\020\021\032\0020\tH@¢\006\002\020\022J\036\020\020\032\0020\0062\006\020\n\032\0020\0132\006\020\f\032\0020\rH@¢\006\002\020\023R\032\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\004X\004¢\006\002\n\000R\016\020\007\032\0020\006X\004¢\006\002\n\000¨\006\024"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRuleList$Companion;", "", "()V", "cache", "Lorg/jetbrains/compose/resources/AsyncCache;", "", "Lorg/jetbrains/compose/resources/plural/PluralRuleList;", "emptyList", "buildCldrLocaleName", "", "languageQualifier", "Lorg/jetbrains/compose/resources/LanguageQualifier;", "regionQualifier", "Lorg/jetbrains/compose/resources/RegionQualifier;", "createInstance", "cldrPluralRuleListIndex", "getInstance", "cldrLocaleName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lorg/jetbrains/compose/resources/LanguageQualifier;Lorg/jetbrains/compose/resources/RegionQualifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library"}) @SourceDebugExtension({"SMAP\nPluralRuleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluralRuleList.kt\norg/jetbrains/compose/resources/plural/PluralRuleList$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,57:1\n11065#2:58\n11400#2,3:59\n37#3,2:62\n*S KotlinDebug\n*F\n+ 1 PluralRuleList.kt\norg/jetbrains/compose/resources/plural/PluralRuleList$Companion\n*L\n53#1:58\n53#1:59,3\n54#1:62,2\n*E\n"}) public static final class Companion { private Companion() {} private final PluralRuleList createInstance(int cldrPluralRuleListIndex) { Pair<PluralCategory, String>[] arrayOfPair1 = CLDRPluralRuleListsKt.getCldrPluralRuleLists()[cldrPluralRuleListIndex]; Pair<PluralCategory, String>[] arrayOfPair2 = arrayOfPair1; int $i$f$map = 0; Pair<PluralCategory, String>[] arrayOfPair3 = arrayOfPair2; Collection<PluralRule> destination$iv$iv = new ArrayList(arrayOfPair2.length); int $i$f$mapTo = 0; byte b; int i; for (b = 0, i = arrayOfPair3.length; b < i; ) { Object<PluralCategory, String> item$iv$iv = (Object<PluralCategory, String>)arrayOfPair3[b];
/* 60 */         Object<PluralCategory, String> object1 = item$iv$iv; Collection<PluralRule> collection = destination$iv$iv; int $i$a$-map-PluralRuleList$Companion$createInstance$pluralRules$1 = 0; collection.add(new PluralRule((PluralCategory)object1.getFirst(), (String)object1.getSecond())); }
/* 61 */        List pluralRules = (List)destination$iv$iv; Collection $this$toTypedArray$iv = pluralRules; int $i$f$toTypedArray = 0;
/* 62 */       Collection thisCollection$iv = $this$toTypedArray$iv;
/* 63 */       return new PluralRuleList((PluralRule[])thisCollection$iv.toArray((Object[])new PluralRule[0])); }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public final Object getInstance(@NotNull LanguageQualifier languageQualifier, @NotNull RegionQualifier regionQualifier, @NotNull Continuation<? super PluralRuleList> $completion) {
/*    */       String cldrLocaleName;
/*    */       if (buildCldrLocaleName(languageQualifier, regionQualifier) == null) {
/*    */         buildCldrLocaleName(languageQualifier, regionQualifier);
/*    */         return PluralRuleList.emptyList;
/*    */       } 
/*    */       return getInstance(cldrLocaleName, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object getInstance(@NotNull String cldrLocaleName, @NotNull Continuation $completion) {
/*    */       Intrinsics.checkNotNull(CLDRPluralRuleListsKt.getCldrPluralRuleListIndexByLocale().get(cldrLocaleName));
/*    */       int listIndex = CLDRPluralRuleListsKt.getCldrPluralRuleListIndexByLocale().get(cldrLocaleName).intValue();
/*    */       return PluralRuleList.cache.getOrLoad(Boxing.boxInt(listIndex), new PluralRuleList$Companion$getInstance$3(listIndex, null), $completion);
/*    */     }
/*    */     
/*    */     @DebugMetadata(f = "PluralRuleList.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.plural.PluralRuleList$Companion$getInstance$3")
/*    */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\030\002\020\000\032\0020\001H@"}, d2 = {"<anonymous>", "Lorg/jetbrains/compose/resources/plural/PluralRuleList;"})
/*    */     static final class PluralRuleList$Companion$getInstance$3 extends SuspendLambda implements Function1<Continuation<? super PluralRuleList>, Object> {
/*    */       int label;
/*    */       
/*    */       PluralRuleList$Companion$getInstance$3(int $listIndex, Continuation $completion) {
/*    */         super(1, $completion);
/*    */       }
/*    */       
/*    */       @Nullable
/*    */       public final Object invokeSuspend(@NotNull Object $result) {
/*    */         IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */         switch (this.label) {
/*    */           case 0:
/*    */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */             return PluralRuleList.Companion.createInstance(this.$listIndex);
/*    */         } 
/*    */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Continuation<Unit> create(@NotNull Continuation<? super PluralRuleList$Companion$getInstance$3> $completion) {
/*    */         return (Continuation<Unit>)new PluralRuleList$Companion$getInstance$3(this.$listIndex, $completion);
/*    */       }
/*    */       
/*    */       @Nullable
/*    */       public final Object invoke(@Nullable Continuation<?> p1) {
/*    */         return ((PluralRuleList$Companion$getInstance$3)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */       }
/*    */     }
/*    */     
/*    */     private final String buildCldrLocaleName(LanguageQualifier languageQualifier, RegionQualifier regionQualifier) {
/*    */       String localeWithRegion = languageQualifier.getLanguage() + "_" + languageQualifier.getLanguage();
/*    */       if (CLDRPluralRuleListsKt.getCldrPluralRuleListIndexByLocale().containsKey(localeWithRegion))
/*    */         return localeWithRegion; 
/*    */       if (CLDRPluralRuleListsKt.getCldrPluralRuleListIndexByLocale().containsKey(languageQualifier.getLanguage()))
/*    */         return languageQualifier.getLanguage(); 
/*    */       return null;
/*    */     } }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final PluralRule[] rules;
/*    */   public static final int $stable = 8;
/*    */   @NotNull
/*    */   private static final AsyncCache<Integer, PluralRuleList> cache = new AsyncCache();
/*    */   @NotNull
/*    */   private static final PluralRuleList emptyList = new PluralRuleList(new PluralRule[0]);
/*    */   
/*    */   static {
/*    */     int $i$f$emptyArray = 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\plural\PluralRuleList.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */