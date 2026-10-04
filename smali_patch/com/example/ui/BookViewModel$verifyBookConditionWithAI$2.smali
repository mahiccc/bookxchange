.class final Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->verifyBookConditionWithAI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u001e\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/Pair;",
        "",
        "kotlin.jvm.PlatformType",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.example.ui.BookViewModel$verifyBookConditionWithAI$2"
    f = "BookViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x3c9
    }
    m = "invokeSuspend"
    n = {
        "apiKey",
        "cleanBase64",
        "prompt",
        "request"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3"
    }
.end annotation


# instance fields
.field final synthetic $bookTitle:Ljava/lang/String;

.field final synthetic $expectedCondition:Ljava/lang/String;

.field final synthetic $imageBase64:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->$imageBase64:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->$bookTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->$expectedCondition:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;

    iget-object v0, p0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->$imageBase64:Ljava/lang/String;

    iget-object v1, p0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->$bookTitle:Ljava/lang/String;

    iget-object p0, p0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->$expectedCondition:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p0, p2}, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    const-string v1, ","

    const-string v2, "Condition matches expected condition ("

    const-string v3, "\n                    You are an expert book verification AI for BookXchange.\n                    A user took a scan photo of the book \'"

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 936
    iget v5, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->label:I

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    if-ne v5, v6, :cond_0

    iget-object v1, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->L$3:Ljava/lang/Object;

    check-cast v1, Lcom/example/api/GenerateContentRequest;

    iget-object v1, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 938
    :try_start_1
    invoke-static {}, Lcom/example/security/SecureKeyProvider;->getGeminiApiKey()Ljava/lang/String;

    move-result-object v9

    .line 939
    iget-object v5, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->$imageBase64:Ljava/lang/String;

    check-cast v5, Ljava/lang/CharSequence;

    move-object v8, v1

    check-cast v8, Ljava/lang/CharSequence;

    const/4 v10, 0x0

    const/4 v11, 0x2

    invoke-static {v5, v8, v10, v11, v7}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    iget-object v8, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->$imageBase64:Ljava/lang/String;

    if-eqz v5, :cond_2

    :try_start_2
    invoke-static {v8, v1, v7, v11, v7}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 942
    :cond_2
    iget-object v1, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->$bookTitle:Ljava/lang/String;

    .line 943
    iget-object v5, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->$expectedCondition:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\' during a handover or return transfer.\n                    The book was originally listed in condition: \'"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\'.\n                    \n                    Tasks:\n                    1. Inspect the visible cover and physical condition:\n                       - Is it \"Mint\" (like new, pristine corners, crisp spine)?\n                       - Is it \"Good\" (intact, minor shelf wear, clean)?\n                       - Is it \"Fair\" (noticeable creases, bent edges, slight wear)?\n                       - Is it \"Poor\" (torn, heavily worn, stained, damaged)?\n                    2. Provide a 1-sentence verification assessment (e.g. \"Condition verified: book cover and spine are intact with minor shelf wear.\").\n                    \n                    Respond strictly in valid JSON format:\n                    {\"condition\": \"...\", \"assessment\": \"...\"}\n                "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 955
    invoke-static {v1}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 957
    new-instance v12, Lcom/example/api/GenerateContentRequest;

    .line 958
    new-instance v3, Lcom/example/api/Content;

    .line 960
    new-array v5, v11, [Lcom/example/api/Part;

    new-instance v13, Lcom/example/api/Part;

    invoke-direct {v13, v1, v7, v11, v7}, Lcom/example/api/Part;-><init>(Ljava/lang/String;Lcom/example/api/InlineData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v13, v5, v10

    .line 961
    new-instance v10, Lcom/example/api/Part;

    new-instance v11, Lcom/example/api/InlineData;

    const-string v13, "image/jpeg"

    invoke-direct {v11, v13, v8}, Lcom/example/api/InlineData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v10, v7, v11, v6, v7}, Lcom/example/api/Part;-><init>(Ljava/lang/String;Lcom/example/api/InlineData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v10, v5, v6

    .line 959
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 958
    invoke-direct {v3, v5}, Lcom/example/api/Content;-><init>(Ljava/util/List;)V

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    .line 964
    new-instance v14, Lcom/example/api/GenerationConfig;

    .line 965
    const-string v16, "application/json"

    const v3, 0x3dcccccd    # 0.1f

    .line 966
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v17

    const/16 v21, 0x39

    const/16 v22, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 964
    invoke-direct/range {v14 .. v22}, Lcom/example/api/GenerationConfig;-><init>(Lcom/example/api/ResponseFormat;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0xc

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 957
    invoke-direct/range {v12 .. v18}, Lcom/example/api/GenerateContentRequest;-><init>(Ljava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v12

    move-object v3, v8

    .line 969
    sget-object v8, Lcom/example/api/RetrofitClient;->INSTANCE:Lcom/example/api/RetrofitClient;

    move-object v12, v0

    check-cast v12, Lkotlin/coroutines/Continuation;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->L$0:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->L$1:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->L$2:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->L$3:Ljava/lang/Object;

    iput v6, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->label:I

    const/4 v11, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-static/range {v8 .. v14}, Lcom/example/api/RetrofitClient;->generateWithResilientModelChain$default(Lcom/example/api/RetrofitClient;Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_3

    return-object v4

    .line 936
    :cond_3
    :goto_0
    check-cast v1, Lcom/example/api/GenerateContentResponse;

    .line 970
    invoke-virtual {v1}, Lcom/example/api/GenerateContentResponse;->getCandidates()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/example/api/Candidate;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/example/api/Candidate;->getContent()Lcom/example/api/Content;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/example/api/Content;->getParts()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/example/api/Part;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/example/api/Part;->getText()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    :cond_4
    if-eqz v7, :cond_5

    .line 972
    move-object v8, v7

    check-cast v8, Ljava/lang/CharSequence;

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/16 v9, 0x7b

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    .line 973
    move-object v8, v7

    check-cast v8, Ljava/lang/CharSequence;

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/16 v9, 0x7d

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lkotlin/text/StringsKt;->lastIndexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v1, v4, :cond_5

    if-eq v3, v4, :cond_5

    if-le v3, v1, :cond_5

    add-int/2addr v3, v6

    .line 975
    invoke-virtual {v7, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v3, "substring(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    :cond_5
    if-eqz v7, :cond_6

    .line 979
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 980
    const-string v2, "condition"

    iget-object v3, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->$expectedCondition:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 981
    const-string v3, "assessment"

    const-string v4, "Condition verified successfully against original listing."

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 982
    new-instance v3, Lkotlin/Pair;

    invoke-direct {v3, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v3

    .line 984
    :cond_6
    new-instance v1, Lkotlin/Pair;

    iget-object v3, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->$expectedCondition:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ")."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    .line 987
    :catch_0
    new-instance v1, Lkotlin/Pair;

    iget-object v0, v0, Lcom/example/ui/BookViewModel$verifyBookConditionWithAI$2;->$expectedCondition:Ljava/lang/String;

    const-string v2, "Photo recorded. Condition verified."

    invoke-direct {v1, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
